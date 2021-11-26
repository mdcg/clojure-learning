(defn imprime-mensagem []
  (println "---------------")
  (println "Bem-vindo(a) ao estoque!"))

(imprime-mensagem)

;; Nome de função Imperativo = "efeito colateral"
(defn aplica-desconto
    "Documentação em Clojure! Retorna o valor que é 90% do valor bruto"
    [valor-bruto]
    (* valor-bruto 0.90))

;; Nome de função Declarativo
(aplica-desconto 100)

(def valor-descontado
    "Retorna o valor com 10% de desconto."
    [valor-bruto]
    (* valor-bruto (- 1 0.10)))

(valor-descontado 100)