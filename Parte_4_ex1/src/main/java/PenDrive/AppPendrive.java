/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenDrive;

import java.util.Scanner;

/**
 *
 * @author Cakeb
 */
public class AppPendrive {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      Pendrive p1 = new Pendrive();
      System.out.println("Informe a marca do Pen Drive: ");
      p1.setMarca(sc.nextLine());
      System.out.println("Informe o modelo do Pen Drive: ");
      p1.setModelo(sc.nextLine());
      System.out.println("Insira a capacidade do Pen Drive: ");
      p1.setCapacidade(Integer.parseInt(sc.nextLine()));
      System.out.println("Insira o comprimento do Pen Drive: ");
      p1.setComprimento(Double.parseDouble(sc.nextLine()));
      System.out.println("Insira a largura do Pen Drive: ");
      p1.setLargura(Double.parseDouble(sc.nextLine()));
      System.out.println("Informe a profundidade do Pen Drive: ");
      p1.setProfundidade(Double.parseDouble(sc.nextLine()));
      System.out.println("Informe o peso do Pen Drive: ");
      p1.setPeso(Double.parseDouble(sc.nextLine()));
      System.out.println("Insira o preço do Pen Drive: ");
      p1.setPreco(Double.parseDouble(sc.nextLine()));
      p1.imprimir();
      
      
    }
}
