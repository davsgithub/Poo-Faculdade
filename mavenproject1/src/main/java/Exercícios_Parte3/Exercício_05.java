
package Exercícios_Parte3;
import java.util.Scanner;

public class Exercício_05 {
    public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		while(n!=-1) {
			System.out.printf("%nInsira um número inteiro: ");
			n = (Integer.parseInt(sc.nextLine()));
			if(n%2==0&&n%3==0) {
				System.out.printf("%nEsse número é múltiplo de 2 e 3.%n");
				
			}
			else {
				System.out.printf("%nEsse número não é multiplo de 2 e 3.%n");
			}
		}
		sc.close();
	}
}
