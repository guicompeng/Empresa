# Empresa
## Sistema de gerenciamento de empresas feito em Java

 - IDE utilizada: NetBeans
 - Data: 15/12/2022
 - Autor: Guilherme de Assis

## Arquitetura
  - A classe `Funcionario` possui atributos gerais de todos funcionários, além do método abstrato `getSalario`.
  - A classe `FuncionarioBeneficio` herda de  `Funcionario` e possui dois métodos abstratos: `getBeneficioBase` e `getBeneficio`
  - As classes `Vendedor` e `Secretario` herdam de `FuncionarioBeneficio`.
  - A classe `Gerente` herda diretamente de `Funcionario`, pois gerentes não possuem benefícios.
  - `Vendedor`, `Secretario` e `Gerente` implementam a interface `Cargo`, que possui 2 métodos abstratos comum a todos eles: `getSalarioBase` e `getAdicionalAnoBase`
  - A classe `Vendedor` possui um ArrayList de `vendas` da classe `Venda`
  - A classe `Empresa` possui um nome e um ArrayList de `funcionarios` da classe `Funcionario`.
  - A classe `Relatorio` possui 6 métodos estáticos de relatórios gerais (ex: retorna o funcionário que mais recebeu no mês)
  - A classe `Teste` realiza as instâncias e testa o projeto.
  