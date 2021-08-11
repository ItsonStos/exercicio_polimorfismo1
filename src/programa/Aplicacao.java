package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;
import entidade.FuncionarioTercerizado;

public class Aplicacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> func = new ArrayList<>();
		
		System.out.print("Quantos funcionários? ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.println("Dados do Funcionário #" + i);
			System.out.print("Funcionário tercerizado? (s/n) ? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double vph = sc.nextDouble();
			if (ch == 's') {
				System.out.print("Valor adicional: ");
				double adicional = sc.nextDouble();
				Funcionario f = new FuncionarioTercerizado(nome, horas, vph, adicional);
				func.add(f);
			} else {
				Funcionario funcionario = new Funcionario(nome, horas, vph);
				func.add(funcionario);
			}
		}
		
		System.out.println();
		System.out.println("Pagamentos: ");
		for (Funcionario funci : func) {
			System.out.println(funci.getNome() + " - $ " + String.format("%.2f", funci.pagamento()));
		}

	}

}
