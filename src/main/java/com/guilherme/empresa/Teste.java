package com.guilherme.empresa;

/**
 *
 * @author guilherme
 */
public class Teste {

    public static void main(String[] args) {

        // instanciar uma empresa ficticia
        Empresa empresa = new Empresa("Empresa Ficticia");

        // instanciar funcionarios
        Funcionario f1 = new Secretario("Jorge Carvalho", 1, 2018);
        Funcionario f2 = new Secretario("Maria Souza", 12, 2015);
        Funcionario f3 = new Vendedor("Ana Silva", 12, 2021);
        Funcionario f4 = new Vendedor("João Mendes", 12, 2021);
        Funcionario f5 = new Gerente("Juliana Alves", 7, 2017);
        Funcionario f6 = new Gerente("Bento Albino", 3, 2014);

        // set vendas dos vendedores f3 e f4
        ((Vendedor) f3).setVenda(new Venda(5200, 12, 2021));
        ((Vendedor) f3).setVenda(new Venda(4000, 1, 2022));
        ((Vendedor) f3).setVenda(new Venda(4200, 2, 2022));
        ((Vendedor) f3).setVenda(new Venda(5850, 3, 2022));
        ((Vendedor) f3).setVenda(new Venda(7000, 4, 2022));

        ((Vendedor) f4).setVenda(new Venda(3400, 12, 2021));
        ((Vendedor) f4).setVenda(new Venda(7700, 1, 2022));
        ((Vendedor) f4).setVenda(new Venda(5000, 2, 2022));
        ((Vendedor) f4).setVenda(new Venda(5900, 3, 2022));
        ((Vendedor) f4).setVenda(new Venda(6500, 4, 2022));

        // set funcionarios na empresa
        empresa.setFuncionario(f1);
        empresa.setFuncionario(f2);
        empresa.setFuncionario(f3);
        empresa.setFuncionario(f4);
        empresa.setFuncionario(f5);
        empresa.setFuncionario(f6);

        // Gerar relatorio da empresa
        empresa.gerarRelatorios();
    }
}
