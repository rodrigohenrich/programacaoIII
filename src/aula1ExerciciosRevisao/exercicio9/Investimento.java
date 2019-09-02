/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1ExerciciosRevisao.exercicio9;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Investimento {
  public static double calculaRendimento(double capital, double aporteMensal, double taxa, int periodo){
    double capitalAtualizado = capital;
    double juros;
    for(int i=0;i<periodo-1;i++){
      juros = capitalAtualizado*(taxa/100);
      capitalAtualizado = capitalAtualizado+aporteMensal+juros;
    }
    return capitalAtualizado;
  }
  public static void main(String[] args) {
    Scanner obter = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();
    df.applyPattern("R$ ##,###.00");
    System.out.println("Entre com o valor a ser investido ");
    double valor = obter.nextFloat();
    System.out.println("Entre com a taxa de rendimento ");
    double taxa = obter.nextFloat();
    char resposta = 's';
    double rendimento;
    double aporteMensal = valor;
    do{
      rendimento = calculaRendimento(valor, aporteMensal, taxa, 12);
      System.out.println("Montante "+df.format(rendimento));
      System.out.println("Continuar por mais um ano? (S/N)");
      resposta = obter.next().charAt(0);
      valor = rendimento;
    }
    while(resposta == 's');
  }
}
