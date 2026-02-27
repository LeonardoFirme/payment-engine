# Payment Engine - Java Strategy Pattern

[![Java Version](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)](https://openjdk.org/projects/jdk/21/)
[![Maven](https://img.shields.io/badge/Maven-3.9+-007398?style=for-the-badge&logo=apache-maven)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](LICENSE)

![Demonstração do Template](./template.png)

## >_ Execução e Retorno via Terminal

![Demonstração do Template](./terminal.png)

Um motor de processamento de pagamentos modular desenvolvido em **Java 21 puro**, focado na demonstração de padrões de projeto (Design Patterns) e princípios **SOLID**.

## 🛠️ Tecnologias e Conceitos

- **Linguagem:** Java 21 (LTS).
- **Gerenciador de Build:** Maven.
- **Design Pattern:** Strategy (para desacoplamento de métodos de pagamento).
- **Java Records:** Utilizados para imutabilidade de DTOs (Data Transfer Objects).
- **Custom Exceptions:** Hierarquia de exceções para tratamento de erros de regra de negócio.
- **Princípios SOLID:** Foco especial em OCP (Open/Closed Principle) e DIP (Dependency Inversion Principle).



## 🏗️ Arquitetura do Projeto

O projeto utiliza o padrão **Strategy** para permitir que novos métodos de pagamento (Pix, Boleto, Cripto) sejam adicionados sem a necessidade de alterar o código central do processador (`PaymentProcessor`).

### Estrutura de Pastas
```text
src/main/java/com/leonardofirme/payments/
├── core/           # Motor de execução (Contexto)
├── exception/      # Exceções personalizadas de domínio
├── model/          # Modelos de dados imutáveis (Records)
└── strategies/     # Contratos e implementações de pagamento
```

---

### 📫 Vamos construir algo grande?

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/leonardofirme)
[![NPM](https://img.shields.io/badge/NPM-CB3837?style=for-the-badge&logo=npm&logoColor=white)](https://www.npmjs.com/~leonardofirme)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/LeonardoFirme)

---

Desenvolvido por **[Leonardo Firme](https://github.com/LeonardoFirme)**