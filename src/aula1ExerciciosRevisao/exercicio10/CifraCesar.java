/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1ExerciciosRevisao.exercicio10;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class CifraCesar {
  public static String cesar(String palavra, int deslocamento, char opc){
    char[] palavraArray = palavra.toCharArray();
    palavra = "";
    for(int i=0;i<palavraArray.length;i++){
      if(opc == 'c')
        palavraArray[i]+=deslocamento;
      else
        palavraArray[i]-=deslocamento;
      palavra+=palavraArray[i];
    }
    return palavra;
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o texto ");
    String texto = ler.next();
    System.out.println("Digite o desclocamento ");
    int deslocamento = ler.nextInt();
    System.out.println("Digite a opção C - Cifrar D - Decifrar");
    char opc = ler.next().charAt(0);
    System.out.println(cesar(texto, deslocamento, opc));
            
  }
}
