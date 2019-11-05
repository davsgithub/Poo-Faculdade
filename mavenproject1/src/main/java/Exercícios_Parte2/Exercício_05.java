
package Exercícios_Parte2;

import java.util.Scanner;
public class Exercício_05 {
    public static void main (String[]args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Insira o seu número de vendedor: ");
		String numero = in.nextLine();
		System.out.println("Insira o seu salário fixo: ");
		double salFixo = (Double.parseDouble(in.nextLine()));
		System.out.println("Insira o total de vendas efetuadas: ");
		double vendas = (Double.parseDouble(in.nextLine()));
		System.out.println("Insira o percentual ganho por cada venda: ");
		double percentual = (Double.parseDouble(in.nextLine()));
		double salTotal = salFixo+percentual*vendas;
		
		System.out.printf("%nNúmero de vendedor: %s",numero);
		System.out.printf("%nSalário total: %.2f",salTotal);
		in.close();
	}
}
