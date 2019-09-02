/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4Lista;

import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class Teste8 {
  public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<>();
    lista.add("Elemento A");
    lista.add("Elemento B");
    lista.add("Elemento C");
    lista.add("Elemento E");
    lista.add(3,"Elemento D");
    System.out.println(lista);
    System.out.println("Qual a posição do 'Elemento C': "+lista.indexOf("Elemento C"));
    System.out.println("A lista está vazia? "+lista.isEmpty());
    System.out.println("Optendo o elemento de posição 2 "+lista.get(2));
    System.out.println("Procurando o elemento C: "+lista.contains("Elemento C"));
    System.out.println("Procurando o elemento J: "+lista.contains("Elemento J"));
    lista.clear();
    System.out.println("A lista está vazia? "+lista.isEmpty());
    System.out.println(lista);
  }
}
