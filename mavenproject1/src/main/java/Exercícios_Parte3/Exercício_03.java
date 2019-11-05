
package Exercícios_Parte3;
import java.util.Scanner;
public class Exercício_03 {
    public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o mês (em número): ");
		int mêsNum = (Integer.parseInt(sc.nextLine())); 
		int numeroDias=0;
		switch(mêsNum)
		{
			case 2: 	
				numeroDias = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				numeroDias = 30;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numeroDias = 31;
				break;
			default: System.out.println("Mês não identificado.");
			}
		System.out.printf("Esse mês tem %d dias",numeroDias);
		sc.close();
	}
}
