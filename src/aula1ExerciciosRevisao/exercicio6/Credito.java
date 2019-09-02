/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1ExerciciosRevisao.exercicio6;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Credito {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Entre com o valor do saldo médio do cliente ");
    double saldoMedio = ler.nextDouble();
    double credito;
    if(saldoMedio<=200){
      System.out.println("Nenhum crédito extra disponível");
    }
    else if(saldoMedio>200 && saldoMedio<= 400){
      credito = saldoMedio*0.2;
      System.out.println("Para o saldo de "+saldoMedio+" será fornecido um "
              + "crédito de "+credito);
    }
    else if(saldoMedio>400 && saldoMedio<= 600){
      credito = saldoMedio*0.3;
      System.out.println("Para o saldo de "+saldoMedio+" será fornecido um "
              + "crédito de "+credito);
    }
    else if(saldoMedio>600){
      credito = saldoMedio*0.4;
      System.out.println("Para o saldo de "+saldoMedio+" será fornecido um "
              + "crédito de "+credito);
    }
  }
}
