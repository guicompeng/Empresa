package com.guilherme.empresa;

/**
 *
 * @author guilherme
 */
public class Secretario extends Funcionario implements Cargo {

    public static final double SALARIO_BASE = 7000;
    public static final double ADICIONAL_ANO_BASE = 1000;
    public static final double BENEFICIO_BASE = 20;

    public Secretario(String nome, int mesContratacao, int anoContratacao) {
        super(nome, mesContratacao, anoContratacao);
    }

    @Override
    public double getSalario(int mes, int ano) {
        double salario = SALARIO_BASE + (ADICIONAL_ANO_BASE * this.getAnosDeEmpresa(mes, ano));
        return salario;
    }
    
    @Override
    public double getBeneficio(int mes, int ano) {
        return (BENEFICIO_BASE/100) * getSalario(mes, ano);
    }

    @Override
    public double getSalarioBase() {
        return SALARIO_BASE;
    }

    @Override
    public double getAdicionalAnoBase() {
        return ADICIONAL_ANO_BASE;
    }

    @Override
    public double getBeneficioBase() {
        return BENEFICIO_BASE;
    }

}
