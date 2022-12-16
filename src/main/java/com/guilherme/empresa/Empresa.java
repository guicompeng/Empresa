package com.guilherme.empresa;

import java.util.ArrayList;

/**
 *
 * @author guilherme
 */
public class Empresa {

    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void gerarRelatorios() {
        // filtrar funcionarios que apenas recebem beneficios ou vendedores
        ArrayList<FuncionarioBeneficio> funcionariosComBeneficios = new ArrayList<>();
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        for (Funcionario f : funcionarios) {
            if (f instanceof FuncionarioBeneficio) {
                funcionariosComBeneficios.add((FuncionarioBeneficio) f);
            }
            if (f instanceof Vendedor) {
                vendedores.add((Vendedor) f);
            }
        }
        System.out.println("Total pago (salários e benefícios) em 12/2021: " + Relatorio.totalPagoComBeneficios(funcionarios, 12, 2021));
        System.out.println("Total pago (somente salários) em 12/2021: " + Relatorio.totalPagoSemBeneficios(funcionarios, 12, 2021));
        System.out.println("Total pago (somente benefícios) em 12/2021: " + Relatorio.totalBeneficios(funcionariosComBeneficios, 12, 2021));
        System.out.println("Funcionário que mais recebeu em 12/2021: " + Relatorio.funcionarioQueMaisRecebeu(funcionarios, 12, 2021).getNome());
        System.out.println("Funcionário que mais recebeu benefício em 12/2021: " + Relatorio.funcionarioQueMaisRecebeuBeneficio(funcionariosComBeneficios, 12, 2021));
        System.out.println("Vendedor que mais vendeu em 12/2021: " + Relatorio.vendedorQueMaisVendeu(vendedores, 12, 2021).getNome());
        System.out.println("Vendedor que mais vendeu em 01/2022: " + Relatorio.vendedorQueMaisVendeu(vendedores, 1, 2022).getNome());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

}
