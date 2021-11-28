;; É possível declarar mais de um simbolo no escopo do let
;; uma vez que o parametro dele é sempre uma lista.
(defn valor-descontado
"Retorna o valor com o desconto"
[valor-bruto]
(let [taxa-de-desconto (/ 10 100)
      desconto         (valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto)))

;; Condicionais
(< 500 100)
(> 500 100)

(if (> 500 100)
    (println "maior")
    (println "menor")) ;; o segundo () sempre será o else, lol

(defn valor-descontado
"Retorna o valor com o desconto se o valor bruto for estritamente maior que 100."
    [valor-bruto]
    (if (> valor-bruto 100)
        (let [taxa-de-desconto (/ 10 100)
              desconto         (valor-bruto taxa-de-desconto)]
        (- valor-bruto desconto))
    valor-bruto))
