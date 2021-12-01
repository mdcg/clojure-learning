(def precos [30 700 1000])
(println (precos 0))
(println (get precos 0))
(println (get precos 2))
;; (println (precos 17)) -> Dá erro!
(println (get precos 17)) ;; Não dá erro, mas retorna nil
(println (get precos 17 10000)) ;; Atribui um valor padrão

(println (conj precos 5)) ;; retorna o vetor com o valor 5, mas a referência antiga não é atualizada

(println ((update precos 0 inc)))
(println ((update precos 1 dec)))

(defn soma-1
  [valor]
  (+ valor 1))

(println (soma-1 10))

(defn aplica-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))

(defn valor-descontado
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println "map" (map valor-descontado precos))

(println (range 10))
(println (filter even? (range 10)))
(println (filter aplica-desconto? precos))

(println (map valor-descontado (filter aplica-desconto? precos)))