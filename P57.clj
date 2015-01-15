; Construct a binary search tree from a list of integer numbers.
(load-file "P56.clj")

(defn construct [numbers]
  (if (empty? numbers)
    nil
    (let [g (group-by (partial > (first numbers)) (rest numbers))]
      (list (first numbers) (construct (g true)) (construct (g false))))))

(defn test-symmetric [numbers]
  (symmetric (construct numbers)))
