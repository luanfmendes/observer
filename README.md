# Sistema de Notificações de Delivery (Padrão Observer)

Este projeto é uma simulação de um sistema de notificações para um serviço de delivery utilizando o padrão de projeto **Observer** em Java. 

## Descrição do Projeto

O sistema permite que usuários (observadores) sejam notificados automaticamente sempre que o status de um pedido for atualizado. Ele demonstra como o padrão Observer pode ser aplicado para resolver problemas de desacoplamento entre os componentes de um sistema.

## Estrutura do Código

### Interfaces
- **Observer**: Interface implementada por todos os observadores. Ela possui o método `update`, que é chamado para notificar o observador de mudanças no status do pedido.
- **Subject**: Interface para a classe que gerencia os observadores. Fornece métodos para adicionar, remover e notificar observadores.

### Implementação
- **DeliverySystem**: Classe que implementa a interface `Subject` e gerencia o status do pedido. Sempre que o status é atualizado pelo método `updateOrderStatus`, todos os observadores registrados são notificados com a nova informação.

### Fluxo de Funcionamento
1. Observadores são registrados usando o método `addObserver`.
2. O método `updateOrderStatus` altera o status de um pedido e chama `notifyObservers` para informar todos os observadores.
3. Cada observador recebe a mensagem de atualização através do método `update`.

