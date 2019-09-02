/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4Lista;

/**
 *
 * @author rodri
 */
public class Teste4 {
  public static void main(String[] args) {
    Vetor lista = new Vetor(10);
    lista.adiciona("elemento 1");
    lista.adiciona("elemento 2");
    lista.adiciona("elemento 3");
    int retorno = lista.buscaPosicaoPeloElemento("Elemento 1");
    System.out.println(retorno);
    
  }
}
