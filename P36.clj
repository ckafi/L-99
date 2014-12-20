; Construct a list containing the prime factors and their multiplicity
(load-file "P37.clj")
(defn prime-factors-mult [n]
  (map #(list (first %) (count %)) (partition-by identity (prime-factors n))))
