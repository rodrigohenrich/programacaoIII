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
public class InvestimentoOpc2 {
  
  public static void main(String[] args) {
    Scanner obter = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();
    df.applyPattern("R$ ##,###.00");
    System.out.println("Entre com o valor a ser investido ");
    float valor = obter.nextFloat();
    System.out.println("Entre com a taxa de rendimento ");
    float taxa = obter.nextFloat();
    char resposta = 's';
    float juros;
    float valorCorrigido = 0;
    do{
      for(int i=0;i<12;i++){
        juros = valorCorrigido*(taxa/100);
        valorCorrigido = valorCorrigido+valor+juros;
      }
      System.out.println("Montante "+df.format(valorCorrigido));
      System.out.println("Continuar por mais um ano? (S/N)");
      resposta = obter.next().charAt(0);
    }
    while(resposta == 's');
  }
}
