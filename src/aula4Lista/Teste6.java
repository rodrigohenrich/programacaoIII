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
public class Teste6 {
  public static void main(String[] args) {
    Vetor minhaLista = new Vetor(2);
    minhaLista.adiciona("Elemento 1");
    minhaLista.adiciona("Elemento 2");
    minhaLista.adiciona("Elemento 3");
    minhaLista.adiciona("Elemento 4");
    System.out.println(minhaLista);
    minhaLista.adiciona(1, "Elemento 6");
    System.out.println(minhaLista);
    System.out.println(minhaLista.removeElemento("Elemento 6"));
    System.out.println(minhaLista);
    minhaLista.limpar();
    System.out.println(minhaLista);
  }
}
