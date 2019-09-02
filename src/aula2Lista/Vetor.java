/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2Lista;

/**
 *
 * @author rodri
 */
public class Vetor {
  private String[] elementos;
  private int tamanho;
  public Vetor(int tamanhoInicial){
    elementos = new String[tamanhoInicial];
    this.tamanho = 0;
  }
  
  public boolean adiciona(String elemento){
    if(tamanho<elementos.length){
      elementos[tamanho++] = elemento;
      return true;
    }
    else
      return false;
  }
  
  public String obterElemento(int posicao){
    if(!(posicao>=0 && posicao<this.tamanho))
      throw new IllegalArgumentException("O número digitado não é uma posição válida");
    return this.elementos[posicao];
  }
  
  public int buscaPosicaoPeloElemento(String elemento){
    for(int i=0;i<tamanho;i++){
      if(elementos[i].equals(elemento)){
        return i;
      }
    }
    return -1;
  }
  
  @Override
  public String toString(){
    String retorno = "[";
    for(int i=0;i<tamanho-1;i++){
      retorno+=elementos[i]+", ";
    }
    retorno+=elementos[tamanho-1]+"]";
    return retorno;
  }
}
