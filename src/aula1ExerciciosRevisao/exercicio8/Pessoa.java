/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1ExerciciosRevisao.exercicio8;

/**
 *
 * @author rodri
 */
public class Pessoa {
  //cpf, nome, sexo, data de nascimento, e-mail)
  private String cpf;
  private String nome;
  private char sexo;
  private String dataNascimento;
  private String eMail;

  public Pessoa() {
  }
  

  public Pessoa(String cpf, String nome, char sexo, String dataNascimento, String eMail) {
    this.cpf = cpf;
    this.nome = nome;
    this.sexo = sexo;
    this.dataNascimento = dataNascimento;
    this.eMail = eMail;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String geteMail() {
    return eMail;
  }

  public void seteMail(String eMail) {
    this.eMail = eMail;
  }
  
}
