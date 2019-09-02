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
public class Vetor2<T> {
  private T[] elementos;
  private int tamanho;
  
  public Vetor2(){
    elementos = (T[]) new Object[10];
    this.tamanho = 0;
  }
  
  public Vetor2(int tamanhoInicial){
    elementos = (T[]) new Object[tamanhoInicial];
    this.tamanho = 0;
  }
  
  private void aumentaCapacidade(){
    if(this.elementos.length == this.tamanho){
      T[] elementosCopia = (T[]) new Object[this.elementos.length*2];
      for(int i=0;i<this.tamanho;i++)
        elementosCopia[i] = this.elementos[i];
      this.elementos = elementosCopia;
    } 
  }
  
  public boolean adiciona(T elemento){
    aumentaCapacidade();
    if(tamanho<elementos.length){
      elementos[tamanho++] = elemento;
      return true;
    }
    else
      return false;
  }
  
  public boolean adiciona(int posicao, T elemento){
    if(!(posicao>=0 && posicao<this.tamanho))
      throw new IllegalArgumentException("O número digitado não é uma posição válida");
    aumentaCapacidade();
    for(int i=this.tamanho-1;i>=posicao;i--){
      this.elementos[i+1] = this.elementos[i];
    }
    this.elementos[posicao] = elemento;
    this.tamanho++;
    return true;
  }
  
  public T obterElemento(int posicao){
    if(!(posicao>=0 && posicao<this.tamanho))
      throw new IllegalArgumentException("O número digitado não é uma posição válida");
    return this.elementos[posicao];
  }
  
  public int buscaPosicaoPeloElemento(T elemento){
    for(int i=0;i<tamanho;i++){
      if(elementos[i].equals(elemento)){
        return i;
      }
    }
    return -1;
  }
  
  public T removeElemento(int posicao){
    if(!(posicao>=0 && posicao<this.tamanho))
      throw new IllegalArgumentException("O número digitado não é uma posição válida");
    T elemento = this.elementos[posicao];
    for(int i=posicao;i<this.tamanho-1;i++)
      this.elementos[i]=this.elementos[i+1];
    this.tamanho--;
    return elemento;
  }
  
  
  @Override
  public String toString() {
    String retorno = "[";
    for (int i = 0; i < tamanho - 1; i++) {
      retorno += elementos[i] + ", ";
    }
    retorno += elementos[tamanho - 1] + "]";
    return retorno;
  }
}
