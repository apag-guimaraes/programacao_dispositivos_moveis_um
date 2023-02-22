package com.example.appprogressbar_spinner_radio;

public class Estudante {
    private String nome,situacao;
    private int idade;

    public Estudante() {
    }

    public Estudante(String nome, String situacao, int idade) {
        this.nome = nome;
        this.situacao = situacao;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", situacao='" + situacao + '\'' +
                ", idade=" + idade +
                '}';
    }
}
