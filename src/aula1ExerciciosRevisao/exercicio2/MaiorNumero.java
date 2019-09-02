/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1ExerciciosRevisao.exercicio2;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class MaiorNumero {
  public static int maiorNumero(int n1, int n2){
    int maior;
    if(n1>n2)
      maior = n1;
    else
      maior = n2;
    return maior;
    /*
    if(n1>n2)
      return n1;
    else
      return n2;
    */
    
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int n1 = ler.nextInt();
    System.out.println("Digite outro número ");
    int n2 = ler.nextInt();
    System.out.println("O maior número é "+maiorNumero(n1, n2));
    
  }
}
