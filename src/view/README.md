# 🍱 Little Hot Pot
## 🗃️ Padrão de Projeto Adapter
O padrão de projeto Adapter é um padrão estrutural que permite que objetos com interfaces incompatíveis trabalhem juntos. Ele atua como um adaptador entre duas classes, permitindo que elas colaborem, mesmo que tenham interfaces diferentes ou incompatíveis. O Adapter traduz uma interface em outra, para que os objetos que antes não poderiam se comunicar possam interagir por meio do adaptador.

O Adapter é útil quando você tem uma classe existente com uma interface estabelecida e deseja usá-la em um contexto em que espera-se outra interface. Em vez de modificar diretamente a classe existente, você pode criar um adaptador que implementa a nova interface e se comunica com a classe existente, traduzindo as chamadas e as transformando em algo que a classe existente possa entender.

O código apresenta uma interface FrontInterface com dois métodos: menuMessage() e registrationMenu(). Em seguida, temos a classe FrontInterfaceAdapter, que implementa essa interface e age como um adaptador entre FrontInterface e a classe específica do tipo de usuário, seja ClientInterface ou SellerInterface.

Essa abordagem permite que você trate os diferentes tipos de usuário de forma uniforme, usando a interface FrontInterface, e delega a implementação específica para as classes adaptadas ClientInterface e SellerInterface. Isso é útil se você deseja manter a consistência na interação com os usuários, independentemente do tipo.

## 🗃️ Implementação do Front-End
A classe ClientInterface representa a interface do usuário para o tipo de usuário Client. Ela implementa a interface FrontInterface, definindo os métodos menuMessage() e registrationMenu(). Esses métodos exibem mensagens e interagem com o usuário para realizar ações, como cadastrar um cliente.

Essa implementação parece estar seguindo o princípio de separação de responsabilidades, onde a classe ClientInterface é responsável pela interação com o usuário e a classe UserManagerFacade (do pacote controller) é responsável pela lógica de negócio

## 🗃️ Padrão de Projeto Strategy/Command
O padrão de projeto Command é um padrão comportamental que encapsula uma solicitação como um objeto, permitindo que você parametrize clientes com diferentes solicitações, enfileire-as ou registre-as e execute-as posteriormente. Ele separa o objeto que invoca a solicitação do objeto que realmente a processa.

O padrão Command envolve a criação de uma classe Command que possui um método para executar uma determinada ação. Essa classe pode ter parâmetros que representam os dados necessários para executar a ação. Em seguida, você pode criar classes que implementam a interface do Command para fornecer diferentes ações. O objeto cliente (que invoca a ação) não precisa saber exatamente qual comando está sendo executado; ele só precisa saber como invocar o método de execução no objeto de comando.

O padrão Command é útil quando você deseja abstrair a invocação de uma ação e separá-la do objeto que a executa. Ele permite que você trate as solicitações como objetos, facilitando o gerenciamento e a extensibilidade das operações.

## 📦 Packages Client e Seller
Contém a divisão do fluxo de tela de cada tipo de usuário, bem como a implementação/inclusão dos padrões de projeto citados acima.