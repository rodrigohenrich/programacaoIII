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
public class Teste16 {
  public static void main(String[] args) {
    Lista<Integer> minhaLista = new Lista<>();
    minhaLista.adiciona(10);
    minhaLista.adiciona(20);
    minhaLista.adiciona(30);
    System.out.println(minhaLista.buscaPosicaoPeloElemento(2));
    minhaLista.removeElemento(1);
    minhaLista.removeElemento(1);
    
  }
}
