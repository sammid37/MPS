# 🍱 Little Hot Pot
## 🗃️ Padrão de Projeto Factory
O padrão de projeto Factory é um padrão de criação que permite a criação de objetos sem especificar explicitamente a classe exata do objeto que será criado. Em vez disso, ele fornece uma interface comum para criar objetos de várias classes derivadas ou implementações diferentes. O objetivo principal do Factory é encapsular a criação de objetos e ocultar a lógica de criação em uma classe separada (a fábrica), tornando o código mais flexível, desacoplado e de fácil manutenção.

As classes abaixo presentes no pacote "factories" seguem o _padrão Factory_ ao encapsular a criação de objetos em métodos estáticos. 

Essa abordagem centraliza a lógica de criação e permite que você crie instâncias de diferentes classes sem conhecer os detalhes de implementação exatos, tornando o código mais flexível e facilmente extensível.

## 📦 Package Factories
### ModelFactory
A classe ModelFactory fornece um método estático chamado `newUser()` que cria e retorna um objeto User com base nas informações fornecidas no mapa `c`. 

### InfraFactory
A classe InfraFactory possui um método estático chamado `newUserFile()` que retorna um objeto **UserFile**. O método `newUserFile()` cria e retorna um novo objeto **UserFile** que é usado para manipular as operações de armazenamento e acesso a arquivos relacionados a usuários.

### ControllerFactory
A classe ControllerFactory possui dois métodos estáticos: `newUserManagerFacade()` e `newUserDao()`.

* O método `newUserManagerFacade()` retorna uma nova instância da classe **UserManagerFacade** que é usada como fachada para o gerenciamento de usuários.
* O método `newUserDao()` retorna uma nova instância da classe **UserDAO** que é responsável por acessar e manipular os dados dos usuários.