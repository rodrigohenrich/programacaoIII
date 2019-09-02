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
public class Vetor {
  private String[] elementos;
  private int tamanho;
  
  public Vetor(){
    elementos = new String[10];
    this.tamanho = 0;
  }
  
  public Vetor(int tamanhoInicial){
    elementos = new String[tamanhoInicial];
    this.tamanho = 0;
  }
  
  private void aumentaCapacidade(){
    if(this.elementos.length == this.tamanho){
      String[] elementosCopia = new String[this.elementos.length*2];
      for(int i=0;i<this.tamanho;i++)
        elementosCopia[i] = this.elementos[i];
      this.elementos = elementosCopia;
    } 
  }
  
  public boolean adiciona(String elemento){
    aumentaCapacidade();
    if(tamanho<elementos.length){
      elementos[tamanho++] = elemento;
      return true;
    }
    else
      return false;
  }
  
  public boolean adiciona(int posicao, String elemento){
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
  
  public String removeElemento(int posicao){
    if(!(posicao>=0 && posicao<this.tamanho))
      throw new IllegalArgumentException("O número digitado não é uma posição válida");
    String elemento = this.elementos[posicao];
    for(int i=posicao;i<this.tamanho-1;i++)
      this.elementos[i]=this.elementos[i+1];
    this.tamanho--;
    return elemento;
  }
  
  public boolean removeElemento(String elemento){
    int posicao = this.buscaPosicaoPeloElemento(elemento);
    if(posicao>=0){
      this.removeElemento(posicao);
      return true;
    }
    return false;
  }
  
  public boolean estaVazia(){
    return this.tamanho==0;
  }
  
  public void limpar(){
    this.tamanho = 0;
  }
  
  public int tamanho(){
    return this.tamanho;
  }
  
  @Override
  public String toString(){
    String retorno = "[";
    if(this.estaVazia())
      retorno+="]";
    else{
      for(int i=0;i<tamanho-1;i++){
        retorno+=elementos[i]+", ";
      }
      retorno+=elementos[tamanho-1]+"]";
    }
    return retorno;
  }
}
