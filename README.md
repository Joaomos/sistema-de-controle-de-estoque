# Gerenciamento de Estoque

## 📌 Sobre o Projeto
Este projeto é um sistema simples de gerenciamento de estoque desenvolvido em **Java**. Ele permite cadastrar produtos, registrar entradas e saídas de estoque, exibir saldo de produtos e remover itens do estoque.

## 🛠️ Tecnologias Utilizadas
- **Java** (JDK 8 ou superior)
- **Paradigma de Programação Orientada a Objetos (POO)**

## 📂 Estrutura do Projeto
```
├── src/
│   ├── main/                  # Classe principal do sistema
│   │   ├── Main.java          
│   ├── model/                 # Modelos (Entidades do sistema)
│   │   ├── Estoque.java       # Classe para gerenciamento do estoque
│   │   ├── Produto.java       # Classe representando os produtos
│   ├── service/               # Serviços de movimentação do estoque
│   │   ├── MovimentacaoEstoque.java
│   ├── view/                  # Camada de visualização (Interface CLI)
│   │   ├── EstoqueView.java
│
└── README.md
```

## 🚀 Funcionalidades
- 📌 **Cadastrar Produto**: Adiciona um novo produto ao estoque.
- 📥 **Registrar Entrada**: Aumenta a quantidade de um produto no estoque.
- 📤 **Registrar Saída**: Diminui a quantidade de um produto no estoque.
- 📋 **Exibir Estoque**: Lista todos os produtos cadastrados.
- 📊 **Exibir Saldo**: Exibe a quantidade de um produto específico.
- ❌ **Remover Produto**: Remove um produto do estoque pelo ID.

## ▶️ Como Executar o Projeto
1. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/estoque-java.git
   ```
2. Acesse a pasta do projeto:
   ```sh
   cd estoque-java
   ```
3. Compile os arquivos Java:
   ```sh
   javac -d bin src/main/Main.java
   ```
4. Execute o programa:
   ```sh
   java -cp bin main.Main
   ```

## 📞 Contato

Se tiver dúvidas ou sugestões, entre em contato:

- **Nome:** João Marcos
- **E-mail:** joaomarcos2827@gmail.com
- **GitHub:** [Joaomos](https://github.com/Joaomos)
- **LinkedIn:** [João Marcos](https://www.linkedin.com/in/ojoaomarcosilva/)




