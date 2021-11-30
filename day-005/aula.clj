(defn mais-caro-que-100?
  [valor-bruto]
  (> valor-bruto 100))

;; é possível passar funções como parâmetros em clojure
(defn valor-descontado
  "Retorna o valor com desconto de 10% se deve aplicar desconto."
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado mais-caro-que-100? 1000))

;; Funções anônimas
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 1000))
(println (valor-descontado #(> %1 100) 1000))
(println (valor-descontado #(> % 100) 1000))