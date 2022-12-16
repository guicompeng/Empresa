package com.guilherme.empresa;

/**
 *
 * @author guilherme
 */
public abstract class Funcionario {

    private String nome;
    private int mesContratacao;
    private int anoContratacao;

    public Funcionario(String nome, int mesContratacao, int anoContratacao) {
        this.nome = nome;
        this.mesContratacao = mesContratacao;
        this.anoContratacao = anoContratacao;
    }

    public abstract double getSalario(int mes, int ano);

    public int getAnosDeEmpresa(int mes, int ano) {
        int anosDeEmpresa = ano - anoContratacao;
        if (mes < mesContratacao) {
            anosDeEmpresa = anosDeEmpresa - 1;
        }
        return anosDeEmpresa < 0 ? 0 : anosDeEmpresa;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMesContratacao() {
        return mesContratacao;
    }

    public void setMesContratacao(int mesContratacao) {
        this.mesContratacao = mesContratacao;
    }

    public int getAnoContratacao() {
        return anoContratacao;
    }

    public void setAnoContratacao(int anoContratacao) {
        this.anoContratacao = anoContratacao;
    }

}
