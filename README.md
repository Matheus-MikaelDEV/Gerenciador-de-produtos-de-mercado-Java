
# Sistema de Gerenciamento de Produtos de Mercado

Este projeto é um sistema simples em Java para cadastrar, listar, remover e alterar produtos em um mercado. Ele utiliza listas, manipulação de datas e ordenação por nome para organizar os produtos.

## 📋 Funcionalidades

- Cadastro de produtos com nome, preço, quantidade e data de validade.
- Listagem dos produtos com detalhes e verificação se estão vencidos.
- Remoção de produtos pelo nome.
- Alteração de nome, preço, quantidade ou data de validade de um produto.
- Ordenação automática dos produtos por nome.

## 🛠️ Tecnologias utilizadas

- Java 17+
- API de datas (`java.time.LocalDate`)
- `Collections.sort` e `Comparator` para ordenação
- Programação orientada a objetos

## 📦 Estrutura do Projeto

```
src/
├── application/
│   └── Program.java         # Contém a lógica principal do programa e o menu interativo
└── enties/
    └── Product.java         # Classe modelo que representa um produto
```

## 🧠 Lógica do Programa

O programa funciona por meio de um menu interativo no console, onde o usuário pode escolher entre:

1. **Cadastrar produto** – O usuário insere os dados do produto.
2. **Listar produtos** – Mostra todos os produtos cadastrados, total por produto e alerta se está vencido.
3. **Remover produto** – Remove um produto pelo nome.
4. **Alterar dados do produto** – Permite editar nome, preço, quantidade ou validade de um produto.
5. **Sair** – Encerra o programa.

## ⚠️ Observações

- A data deve ser inserida no formato `dd/MM/yyyy`.
- O programa valida se a data está antes da data atual para verificar se o produto está vencido.
- O nome dos produtos é utilizado como identificador para remoção e alteração.

## 📌 Exemplo de uso

```
[1] Cadastrar produto
Nome do produto: Arroz
Preço do produto: 25.50
Quantidade do produto: 10
Data de validade do produto (dd/MM/yyyy): 15/12/2025
Produto cadastrado com sucesso!

[2] Listar produtos
Produto 1:
Nome: Arroz
Preço: R$25.5
Quantidade: 10
Data de validade: 15/12/2025
Total por produto: R$255.0
Produto dentro do prazo de validade.
```

---

Projeto simples ideal para iniciantes praticarem listas, objetos e manipulação de datas em Java.
