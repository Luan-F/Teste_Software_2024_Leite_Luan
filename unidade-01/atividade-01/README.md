# Reproduzindo caso de teste (tutorial)
Nessa pergunta, o autor relata que possui problemas quando espera que vários métodos lancem uma exceção (utilizando o `@Rule`).
Então, será implementado um caso onde um método chama outro que pode lançar uma exceção.

Como o projeto base implementa uma calculadora para demonstrar os testes do JUnit, serão implementados dois métodos neste tutorial, o div (para calcular a divisão) e o avg
(para calcular a média de um array).

Primeiro, será implementado o método div, pois ele será utilizado no método avg. Ele receberá dois argumentos a e b e retornará o resultado de a / b, caso b seja diferente de zero.
Caso b seja igual a zero, será lançada uma exceção com a mensagem "Divisão por zero".

- Observação: O print é do arquivo `Calculator.java`, dentro da pasta `src/main/java/com/example/project/`.

Após implementar o método div, a próxima etapa será implementar o teste desse método. Como o tutorial é focado na implementação de testes para tratar o lançamento de exceção dos métodos,
o único teste implementado para esse método será para validar se ele lançou uma exceção.

Antes de escrever os testes, é necessário realizar o import da função assertThrows, para verificar se a exceção foi lançada corretamente. Para fazer isso basta adicionar a seguinte linha antes da declaração da classe CalculatorTests:

`import static org.junit.jupiter.api.Assertions.assertThrows;`

- Observação: `CalculatorTest` fica dentro do arquivo `src/test/java/com/example/project/CalculatorTest.java`.

Para implementar este teste, basta modificar a classe `CalculatorTests`, adicionando o método `divThrows` com o decorator `@Test`.
Dentro desse método, é necessário criar uma instância da classe `Calculator`, depois disso será utilizada a função `assertThrows` para executar o método div e esperar o lançamento de um erro.
Para finalizar, basta apenas verificar se a mensagem de erro recebida bate com a mensagem de erro esperada.

Nesta etapa, o método `avg` será implementado (dentro da classe `Calculator`), ele recebe um array de floats e retorna a média aritmética dos valores desse array.
Para calcular a média, ele usa o método div então, caso ocorra uma divisão por zero, o método também deve lançar uma exceção.

A implementação do teste para o método `avg` (na classe `CalculatorTest`) é muito parecida com a do método `div`.
Nele é necessário instanciar a classe `Calculator`, iniciar uma variável que possui um array vazio e, utilizar os métodos `assertThrows` e `assertTrue` para verificar se o método lançou uma exceção e se
a mensagem da exceção é a esperada.

Para rodar os testes novamente, basta executar o comando `build.sh`.

# Como rodar
Para executar esse projeto, basta ter uma versão **compativel** do Java e executar o comando `./build.sh` para executar os testes.
- Observação: Esse projeto foi testado com o **OpenJDK 18 e 17**.

# Links
- https://github.com/Luan-F/Teste_Software_2024_Leite_Luan
- https://stackoverflow.com/questions/40268446/junit-5-how-to-assert-an-exception-is-thrown

# Referência
- https://github.com/junit-team/junit5-samples
