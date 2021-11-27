;; Variáveis são na verdade simbolos...

;; def são na verdade declarações de simbolos globais, independentes
;; deles serem chamados num escopo de uma função
(defn valor-descontado
    "Retorna o valor descontado"
    [valor-bruto]
    (def desconto 0.10)
    (*valor-bruto (-1 desconto)))

;; Para definir simbolos com escopo de uma função temos que trabalhar de uma
;; forma um pouco diferente:
(defn valor-descontado
    "Retorna o valor descontado"
    [valor-bruto]
    ;; O let tem um escopo realmente fechado, uma vez que caso você saia
    ;; do () ele perde a referência
    (let desconto [0.10]
        (*valor-bruto (-1 desconto)))) ;; é interessane fechar todos os parenteses na última instrução, pra ficar claro..

(class 90.0) ;; Double
(class 90N) ;; BigInt
(class 90N) ;; BigDouble
