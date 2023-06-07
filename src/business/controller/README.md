# 🍱 Little Hot Pot

## 📦 Package Controller
O pacote "controller" normalmente é responsável por gerenciar a lógica de negócios e a interação entre os diferentes componentes do sistema. Ele atua como uma camada intermediária entre a interface do usuário (ou outras fontes de entrada) e o acesso aos dados, facilitando o processamento e a manipulação dos dados de acordo com as regras de negócios.

### UserDAO
A classe UserDAO é responsável por fornecer métodos para acessar e manipular dados de usuários. Ela possui um mapa chamado users que armazena os usuários, onde a chave é o ID do usuário e o valor é um objeto User. 

### UserManagerFacade
A classe UserManagerFacade é uma fachada (facade) que fornece uma interface simplificada para o gerenciamento de usuários. Ela encapsula o acesso à classe UserDAO e fornece métodos para interagir com ela. 