
package Exercícios_Parte3;

import java.util.Scanner;
public class Exercício_04 {
    public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um valor inteiro: ");
		int n1 = (Integer.parseInt(sc.nextLine()));
		System.out.println("Insira mais um valor inteiro: ");
		int n2 = (Integer.parseInt(sc.nextLine()));
		if (n1<n2) {
			int j = 1; 
			for(int i = 0;i<=n2;) {
				int x = i;
				if(x%2==0&&x!=0) {
					System.out.printf("%n%n%doNúmero par: %d",j,x);
					j++;
				}
				i++;
			}
		
		}
		sc.close();
	}
}
