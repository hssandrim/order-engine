# Order Engine 🛒

Projeto pessoal desenvolvido em Java puro para praticar o padrão de projeto **Strategy**, encapsulamento, controle de estados e programação defensiva em um modelo de e-commerce.

---

## 📌 Sobre o Projeto

O sistema simula o processamento do ciclo de vida de compras em um e-commerce, desde a montagem do carrinho com produtos e controle de estoque até a aplicação de taxas/descontos via estratégias de pagamento e despacho final do pedido.

---

## 🛠️ Conceitos e Tecnologias Aplicadas

* **Java Core & POO**: Encapsulamento, agregação de objetos e manipulação de coleções (`List` / `ArrayList`).
* **Design Pattern (Strategy)**: Interface `FormaPagamento` utilizada para isolar a regra de cálculo financeiro das modalidades de pagamento (Pix com desconto de 10%, Cartão e Boleto).
* **Programação Defensiva**: Validação de regras de negócio com lançamento de exceções (`IllegalArgumentException` para estoque insuficiente e `IllegalStateException` para envio de pedido não pago).
* **Gestão de Estados**: Enum (`StatusPedido`) garantindo a transição segura entre `AGUARDANDO_PAGAMENTO`, `PAGO` e `ENVIADO`.

---

## 📂 Estrutura das Classes

```text
src/
├── FormaPagamento.java        # Interface do Strategy Pattern
├── PagamentoPix.java          # Implementação do cálculo Pix (10% de desconto)
├── PagamentoCartao.java       # Implementação do cálculo no cartão
├── PagamentoBoleto.java       # Implementação do cálculo no boleto
├── Produto.java               # Entidade com preço e controle de estoque
├── ItemPedido.java            # Agregação de produto e quantidade
├── Pedido.java                # Agregador central do domínio e transição de estados
├── StatusPedido.java          # Enum do ciclo de vida do pedido
└── Main.java                  # Testes de integração e simulação do fluxo completo
```

---

## 💻 Como Executar

1. Clone o repositório:
   ```bash
   git clone [https://github.com/hssandrim/order-engine.git](https://github.com/hssandrim/order-engine.git)
   ```
2. Acesse a pasta do projeto e compile os arquivos:
   ```bash
   cd order-engine
   javac *.java
   ```
3. Execute o projeto:
   ```bash
   java Main
   ```

---

## 👤 Autor

**Henrique Soares Sandrim**
* Estudante de Análise e Desenvolvimento de Sistemas (USJT)
* LinkedIn: [in/henrique-sandrim](https://www.linkedin.com/in/henrique-sandrim/)
* GitHub: [@hssandrim](https://github.com/hssandrim)
