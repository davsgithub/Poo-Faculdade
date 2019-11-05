
package Exercícios_Parte2;
import java.util.Scanner;
public class Exercício_01 {
    public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tempo gasto na viagem: ");
		double tempo = (Double.parseDouble(sc.nextLine()));
		System.out.println("Informe a velocidade média durante a viagem: ");
		double velocidadeMedia = (Double.parseDouble(sc.nextLine()));
		double distancia = tempo*velocidadeMedia;
		double litrosUsados = distancia/12;
		System.out.printf("%nA velocidade média foi: %.2f",velocidadeMedia);
		System.out.printf("%nO tempo gasto na viagem foi: %.2f",tempo);
		System.out.printf("%nA distância percorrida foi: %.2f", distancia);
		System.out.printf("%nA quantidade de litros usados na viagem foi: %.2fL", litrosUsados);
		sc.close();
		
		
	}
    
}
