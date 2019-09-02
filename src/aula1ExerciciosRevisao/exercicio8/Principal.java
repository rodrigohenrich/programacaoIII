/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1ExerciciosRevisao.exercicio8;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Principal {
  public static void main(String[] args) {
     //cpf, nome, sexo, data de nascimento, e-mail)
    Scanner ler = new Scanner(System.in);
    Pessoa[] lista = new Pessoa[6];
    int contH=0,contM=0;
    for(int i=0;i<6;i++){
      lista[i] = new Pessoa();
      System.out.println("Entre com o nome da pessoa "+(i+1));
      lista[i].setNome(ler.next());
      System.out.println("Entre com o cpf da "+lista[i].getNome());
      lista[i].setCpf(ler.next());
      System.out.println("Entre com o sexo da pessoa (F/M)");
      lista[i].setSexo(ler.next().charAt(0));
      if(lista[i].getSexo()=='F')
        contM++;
      else
        contH++;
      System.out.println("Entre com a data de nascimento da pessoa");
      lista[i].setDataNascimento(ler.next());
      System.out.println("Entre com o e-mail");
      lista[i].seteMail(ler.next());
      
    }
    System.out.println("Do total são homens "+contH+" e mulheres "+contM);
  }
}
