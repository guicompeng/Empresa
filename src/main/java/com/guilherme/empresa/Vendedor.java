package com.guilherme.empresa;

import java.util.ArrayList;

/**
 *
 * @author guilherme
 */
public class Vendedor extends FuncionarioBeneficio implements Cargo {

    public static final double SALARIO_BASE = 12000;
    public static final double ADICIONAL_ANO_BASE = 1800;
    public static final double BENEFICIO_BASE = 30;

    private ArrayList<Venda> vendas;

    public Vendedor(String nome, int mesContratacao, int anoContratacao) {
        super(nome, mesContratacao, anoContratacao);
        this.vendas = new ArrayList<>();
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public Venda getVenda(int mes, int ano) {
        for (Venda v : vendas) {
            if (v.getMes() == mes && v.getAno() == ano) {
                return v;
            }
        }
        return new Venda(0, mes, ano);
    }

    public void setVenda(Venda venda) {
        this.vendas.add(venda);
    }

    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }

    @Override
    public double getSalario(int mes, int ano) {
        if (ano < this.getAnoContratacao() || (ano == this.getAnoContratacao() && mes < this.getMesContratacao())) {
            return 0;
        }
        double salario = SALARIO_BASE + (ADICIONAL_ANO_BASE * this.getAnosDeEmpresa(mes, ano));
        return salario;
    }

    @Override
    public double getBeneficio(int mes, int ano) {
        return (BENEFICIO_BASE / 100) * getVenda(mes, ano).getValor();
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
