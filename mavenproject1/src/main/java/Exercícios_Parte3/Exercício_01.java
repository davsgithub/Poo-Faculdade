
package Exercícios_Parte3;
import java.util.Scanner;
public class Exercício_01 {
    public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um inteiro: ");
		int n  = (Integer.parseInt(sc.nextLine()));
		if (n%3==0&&n%4==00) {
			System.out.println("Esse número é múltiplo de 3 e 4 ao mesmo tempo.");
		}
		else {
			System.out.println("Esse número não é múltiplo de 3 e 4 ao mesmo tempo.");
		}
		sc.close();
	
	}
}
