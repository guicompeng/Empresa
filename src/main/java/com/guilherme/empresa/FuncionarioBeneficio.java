package com.guilherme.empresa;

/**
 *
 * @author guilherme
 */
public abstract class FuncionarioBeneficio extends Funcionario {

    public FuncionarioBeneficio(String nome, int mesContratacao, int anoContratacao) {
        super(nome, mesContratacao, anoContratacao);
    }

    public abstract double getBeneficio(int mes, int ano);

    public abstract double getBeneficioBase();

}
