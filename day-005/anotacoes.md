O Cursive possui dezenas de atalhos que nos ajudam no dia a dia. O guia de usuário deles possui diversas páginas que sugiro ler de vez em quando. Não precisa ler tudo de uma vez só. Uma vez por semana olha uma página nova de atalhos para você tentar incorporar ao seu dia a dia. Lembre-se que no dia a dia gastamos mais tempo pensando e elaborando o que fazer do que digitando, não estamos numa competição de digitação, mas provavelmente queremos produzir código bom que seja de manutenção boa a médio prazo. https://cursive-ide.com/userguide.

Para explorar alguma coisa parece ser útil escrever código dentro de seu core, mas na prática como o comando lein run carrega e roda o seu código do core, não é interessante deixar código de teste ou exploração voando. Nossos cursos de testes ensinam onde colocamos testes automatizados e é comum explorarmos através do REPL. Pessoalmente, por vezes, gosto de explorar dentro de um arquivo qualquer onde escrevo código temporário, mas sempre antes de gerar uma aplicação final esse código de exploração é jogado fora.

Funções são "coisas" é a maneira informal de dizer que aqui em Clojure funções são tratadas como algo muito importante, tão importantes quanto dados. Isto é, você pode trabalhar com símbolos que referenciam funções. Funções são "first class citizens". Inclusive você pode passá-las como argumento para outras funções, ou recebê-las como retorno de funções. Funções que recebem ou retornam funções são chamadas de "higher order functions".

- Utilizar o plugin Cursive;
- O que é o namespace;
- Atalhos do Intellij;
- Utilizar o ; para comentar a linha;
- O que são predicates;
- Fazer uma função chamar a outra;
- Criar uma função anônima;
- Utilizar % para fazer um função lambda.