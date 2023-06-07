# Métodos de Projeto de Software
## Little Hot Pot

A Universidade Federal da Paraíba dispõe de duas localizações dentro da cidade de João Pessoa, sendo a principal dela encontrada no bairro de Castelo Branco. O outro local, em Mangabeira, inaugurado em 2013, tem vários pontos de precariedade quando comparado à sede da UFPB (em Castelo Branco), sendo um deles a falta de um RU (Restaurante Universitário).

Tendo esse problema em vista, despertou-se a ideia de uma aplicação capaz de reunir os pequenos negócios alimentícios, que se formaram ao redor e dentro dos centros da UFPB em Mangabeira, para facilitar o pedido de lanches e de refeições, para os compradores, e o gerenciamento do cardápio e dos pedidos de clientes, para os vendedores.

## Participantes
* Ana Cecilia da Silva do Nascimento
* Gabriel Monteiro de Andrade
* Maria Victória Grisi Pinheiro Fabião de Áraujo
* Mayra Daher de Carvalho Pereira
* Samantha Dantas Medeiros

## Implementação 
O seguinte trabalho foi desenvolvido para aplicar os padrões de projeto lecionado na disciplina de Métodos de Projeto de Software.

### Padrões de Projeto Utilizados
* Adapter
* Command
* Façade
* Factory
* Template

## Execução

1. Compile todos os arquivos

```bash
javac .\src\business\controller\*.java .\src\business\model\*.java .\src\business\template\*.java .\src\factories\*.java .\src\infra\*.java .\src\util\exceptions\*.java .\src\util\*.java .\src\view\*.java
```

2. Execute o arquivo principal
```bash
java view.Main
```