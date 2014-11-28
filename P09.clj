(defn pack [coll]
  (reverse
    (reduce #(if (= %2 (first (first %1)))
               (conj (rest %1) (conj (first %1) %2))
               (conj %1 (list %2)))
            '()
            coll)))
