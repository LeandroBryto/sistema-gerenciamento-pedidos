# Sistema de Cadastro de Pedidos

Este é um **sistema simples de cadastro de pedidos** desenvolvido em **Java**. O objetivo principal é gerenciar pedidos, permitindo o cadastro de novos pedidos, alteração de status e consulta de pedidos por status. O sistema está em desenvolvimento e tem como finalidade ajudar no processo de aprendizado e crescimento como desenvolvedor. 

**Nota**: O sistema não utiliza banco de dados, os dados são armazenados temporariamente em memória (lista).

## Funcionalidades

- **Cadastrar Pedido**: Permite cadastrar um novo pedido com informações como nome do cliente, tipo de serviço e data de entrega.
- **Alterar Status do Pedido**: Altera o status de um pedido existente (ex: "Em andamento", "Concluído", "Entregue").
- **Consultar Pedidos por Status**: Consulta os pedidos filtrados por um status específico.
- **Listar Todos os Pedidos**: Exibe todos os pedidos cadastrados no sistema.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação usada para o desenvolvimento do sistema.
- **JUnit**: Para testes automatizados.
- **Swing**: Biblioteca Java para construção da interface gráfica (caso você tenha uma interface gráfica).
- **Maven**: Para gerenciamento de dependências e build do projeto.

## Como Rodar o Projeto

### Pré-requisitos

- [Java JDK 8 ou superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/download.cgi) (caso não tenha, pode usar o Maven embutido em sua IDE)

### Passos

1. **Clone o repositório**:

   Abra o terminal e execute o comando:

   ```bash
  
   git clone https://github.com/LeandroBryto/sistema-cadastro-pedidos.git
