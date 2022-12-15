package com.guilherme.empresa;

import java.util.ArrayList;

/**
 *
 * @author guilherme
 */
public class Relatorio {

    /**
     * Um método que receba uma lista de funcionários, mês e ano e retorne o
     * valor total pago (salário e benefício) a esses funcionários no mês.
     *
     * @param funcionarios
     * @param mes
     * @param ano
     * @return double - valor total com beneficio
     */
    public static double totalPagoComBeneficios(ArrayList<Funcionario> funcionarios, int mes, int ano) {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.getSalario(mes, ano) + f.getBeneficio(mes, ano);
        }
        return total;
    }

    /**
     * Um método que receba uma lista de funcionários, mês e ano e retorne o
     * total pago somente em salários no mês.
     *
     * @param funcionarios
     * @param mes
     * @param ano
     * @return double - valor total (sem beneficio)
     */
    public static double totalPagoSemBeneficios(ArrayList<Funcionario> funcionarios, int mes, int ano) {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.getSalario(mes, ano);
        }
        return total;
    }

    /**
     * Um método que receba uma lista somente com os funcionários que recebem
     * benefícios, mês e ano e retorne o total pago em benefícios no mês.
     *
     * @param funcionarios
     * @param mes
     * @param ano
     * @return double - valor total em beneficios
     */
    public static double totalBeneficios(ArrayList<Funcionario> funcionarios, int mes, int ano) {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.getBeneficio(mes, ano);
        }
        return total;
    }

    /**
     * Um método que receba uma lista de funcionários, mês e ano e retorne o que
     * recebeu o valor mais alto no mês.
     *
     * @param funcionarios
     * @param mes
     * @param ano
     * @return Funcionario - objeto funcionario que mais recebeu no mes
     */
    public static Funcionario funcionarioQueMaisRecebeu(ArrayList<Funcionario> funcionarios, int mes, int ano) {
        Funcionario fMaior = funcionarios.get(0);
        for (Funcionario f : funcionarios) {
            if (f.getSalario(mes, ano) > fMaior.getSalario(mes, ano)) {
                fMaior = f;
            }
        }
        return fMaior;
    }

    /**
     * Um método que receba uma lista somente com os funcionários que recebem
     * benefícios, mês e ano e retorne o nome do funcionário que recebeu o valor
     * mais alto em benefícios no mês.
     *
     * @param funcionarios
     * @param mes
     * @param ano
     * @return Funcionario - objeto funcionario que mais recebeu no mes
     */
    public static String funcionarioQueMaisRecebeuBeneficio(ArrayList<Funcionario> funcionarios, int mes, int ano) {
        Funcionario fMaior = funcionarios.get(0);
        for (Funcionario f : funcionarios) {
            if (f.getBeneficio(mes, ano) > fMaior.getBeneficio(mes, ano)) {
                fMaior = f;
            }
        }
        return fMaior.getNome();
    }

    /**
     * Um método que receba uma lista de vendedores, mês e ano e retorne o que
     * mais vendeu no mês.
     *
     * @param vendedores
     * @param mes
     * @param ano
     * @return Funcionario - objeto funcionario que mais recebeu no mes
     */
    public static Vendedor vendedorQueMaisVendeu(ArrayList<Vendedor> vendedores, int mes, int ano) {
        Vendedor vMaior = vendedores.get(0);
        for (Vendedor v : vendedores) {
            if (v.getVenda(mes, ano).getValor() > vMaior.getVenda(mes, ano).getValor()) {
                vMaior = v;
            }
        }
        return vMaior;
    }
}
