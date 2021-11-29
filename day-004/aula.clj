(ns day-004.aula)

;; Predicate
(defn aplica-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))

(println (aplica-desconto? 1000))
(println (aplica-desconto? 1000))

(defn valor-descontado
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [
          taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto)) 

;; Existem maneiras mais fáceis de criar predicates!
(defn aplica-desconto?
  [valor-bruto]
  (when (> valor-bruto 100)
    true)) ;; When é um caso que não precisa do else, como é o caso do form if

;; Mais fácil ainda!
(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100)) 

