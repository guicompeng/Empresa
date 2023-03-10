package com.guilherme.empresa;

/**
 *
 * @author guilherme
 */
public class Gerente extends Funcionario implements Cargo {

    public static final double SALARIO_BASE = 20000;
    public static final double ADICIONAL_ANO_BASE = 3000;

    public Gerente(String nome, int mesContratacao, int anoContratacao) {
        super(nome, mesContratacao, anoContratacao);
    }

    @Override
    public double getSalario(int mes, int ano) {
        if(ano < this.getAnoContratacao() || (ano == this.getAnoContratacao() && mes < this.getMesContratacao()))
            return 0;
        double salario = SALARIO_BASE + (ADICIONAL_ANO_BASE * this.getAnosDeEmpresa(mes, ano));
        return salario;
    }

    @Override
    public double getSalarioBase() {
        return SALARIO_BASE;
    }

    @Override
    public double getAdicionalAnoBase() {
        return ADICIONAL_ANO_BASE;
    }

}
