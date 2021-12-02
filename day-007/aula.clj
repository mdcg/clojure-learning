(def precos [30 700 1000])

(println (reduce + precos)) ;; + é uma função. Lol

(defn minha-soma
    [valor-1 valor-2]
    (+ valor-1 valor-2))

(println (reduce minha-soma precos))
(println (reduce minha-soma (range 10)))

(println (reduce minha-soma 20 precos)) ;; O reduce pode receber um número inicial como parâmetro
