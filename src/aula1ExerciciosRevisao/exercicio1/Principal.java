/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1ExerciciosRevisao.exercicio1;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Principal {
  public static void main(String[] args) {
    Scanner obter = new Scanner(System.in);
    Pessoa[] listaPessoa = new Pessoa[3];
    int iPessoaMaisNova=0, idadePessoaMaisNova=0, iPessoaMaisVelha=0, idadePessoaMaisVelha=0;
    for(int i=0;i<3;i++){
      //Opção I
      //listaPessoa[i]= new Pessoa();
      System.out.println("Digite o nome a pessoa "+(i+1));
      //Opção II
      String nome = obter.next();
      //Opção I
      //listaPessoa[i].setNome(obter.next());
      System.out.println("Digite a idade da pessoa "+nome+" ");
      //Opção II
      int idade = obter.nextInt();
      //Opção I
      //listaPessoa[i].setIdade(obter.nextInt());
      //Opção II
      listaPessoa[i] = new Pessoa(nome, idade);
      if(i==0){
        iPessoaMaisNova = i;
        idadePessoaMaisNova = listaPessoa[i].getIdade();
        iPessoaMaisVelha = i;
        idadePessoaMaisVelha = listaPessoa[i].getIdade();
      }
      if(listaPessoa[i].getIdade()<idadePessoaMaisNova){
        iPessoaMaisNova = i;
        idadePessoaMaisNova = listaPessoa[i].getIdade();
      }
      if(listaPessoa[i].getIdade()>idadePessoaMaisVelha){
        iPessoaMaisVelha = i;
        idadePessoaMaisVelha = listaPessoa[i].getIdade();
      }
    }
    System.out.println("A pessoa mais velha da lista é "+listaPessoa[iPessoaMaisVelha].getNome());
    System.out.println("A pessoa mais jovem da lista é "+listaPessoa[iPessoaMaisNova].getNome());
  }
}
