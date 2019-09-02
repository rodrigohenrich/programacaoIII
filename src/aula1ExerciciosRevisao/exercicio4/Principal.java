/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1ExerciciosRevisao.exercicio4;

/**
 *
 * @author rodri
 */
public class Principal {
  public static int fibo(int n){
    if(n<2)
      return n;
    else{
      return fibo(n-1)+fibo(n-2);
    }
  }
  public static void main(String[] args) {
    for(int i=0;i<19;i++){
      System.out.print(" "+fibo(i));
    }
  }
}
