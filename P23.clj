; Extract a given number of randomly selected elements from a list
(load-file "P20.clj")
(defn rnd-select [coll n]
  (loop [coll coll
         n n
         res []]
    (if (zero? n)
      res
      (let [sel (rand-int (count coll))]
        (recur (remove-at coll (inc sel))
               (dec n)
               (conj res (nth coll sel)))))))
