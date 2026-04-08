# atividade-debug-java-1mes
🧪 Descrição do Sistema — Controle de Estoque de Produtos

O código tem como objetivo representar um sistema simples de controle de estoque, utilizando programação orientada a objetos em Java.

A classe Produto é responsável por modelar os dados de um item do estoque. Cada produto possui informações como identificador, nome, preço e quantidade disponível. Esses dados são definidos no momento da criação do objeto e podem ser acessados e modificados por meio de métodos apropriados.

Além disso, a classe implementa um método de exibição (toString()), que organiza e apresenta os dados do produto de forma clara, permitindo visualizar rapidamente suas informações principais, como nome, preço e quantidade em estoque.

Outro comportamento importante é o método responsável por verificar a quantidade disponível de cada produto. Esse método analisa o estoque e exibe uma mensagem de notificação:

Caso a quantidade esteja acima de um determinado limite, o sistema sugere a reposição do produto.
Caso contrário, informa que o produto ainda está disponível em estoque, exibindo a quantidade restante.

Já a classe principal (Main) tem a função de executar o sistema. Nela, são criados diferentes produtos com valores específicos, simulando um pequeno estoque.

O programa então:

Exibe as informações de cada produto cadastrado.
Verifica a situação do estoque de cada item que caso o item estiver com a quantidade menor ou igual a 5 deve executar o metodo pedido mostrando uma mensagem de notificação.
Mostra mensagens informando se há necessidade de reposição ou se o estoque ainda está adequado.

De forma geral, o sistema simula um controle básico de estoque, permitindo cadastrar produtos, visualizar suas informações e acompanhar automaticamente a quantidade disponível para auxiliar na tomada de decisão sobre reposição.
