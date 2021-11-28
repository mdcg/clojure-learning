BigInt e BigDecimal não vão apresentar os tradicionais erros silenciosos de estouro em algumas linguagens, isto é, pegue o maior número de um Long e some 1, ele estoura. Pegue o menor Long possível e tire 1, ele estoura. Em Clojure, se o tipo de seu dado é Long ou Double ele automaticamente é passado para BigInt e BigDecimal, evitando tais situações, entre outros benefícios.

Para ser um pouco mais formal, if é uma forma, não é uma função, e é uma forma especial https://clojure.org/reference/special_forms#if. Na prática, formas especiais podem ser utilizadas em nosso código e se misturam com as funções que invocamos em diversos momentos. Em geral, serão formas especiais aquelas que formam a base mínima da linguagem, uma maneira tradicional que as linguagens encontram para que a maior parte da mesma seja implementada na própria linguagem. Por exemplo, a função count é escrita na linguagem Clojure utilizando condicionais. Na prática, formas como if, let etc e funções aparecem misturadas em nosso código o tempo todo e por vício de linguagem é comum chamar uma forma especial de função, apesar da mesma ser uma forma.

O que aprendi até agora...

Definir uma variável com def ela tem o escopo global, dependendo do namespace;
Algumas boas práticas com Clojure;
Criar uma variável de escopo local com o let;
Utilizar o class para descobrir o tipo da variável;
Trabalhar com condicionais if;
Que o nil(Nulo) é considerado false dentro do if.