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
public class Teste15 {
  public static void main(String[] args) {
    Lista<String> minhaLista = new Lista<>();
    minhaLista.adiciona("Elemento 1");
    minhaLista.adiciona("Elemento 2");
    minhaLista.adiciona("Elemento 3");
    System.out.println(minhaLista.buscaPosicaoPeloElemento("Elemento 2"));
  }
}
