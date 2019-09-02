/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1ExerciciosRevisao.exercicio3;

/**
 *
 * @author rodri
 */
public class Principal {
  public static void main(String[] args) {
    long mult = 1;
    int soma = 0;
    for(int i=1; i<30;i++){
      if(i%2==0)
        mult*=i;
      else
        soma+=i;
    }
    System.out.println("A soma dos números entre 0 e 30 é "+soma);
    System.out.println("A multiplicação dos números entre 0 e 30 é "+mult);
  }
 
}
