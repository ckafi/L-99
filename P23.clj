(defn remove-at [coll n]
  (concat (take (dec n) coll) (drop n coll)))

(defn rnd-select [coll n]
  (loop [coll coll
         n n
         res []]
    (if (zero? n)
      coll
      (let [sel (rand-int (count coll))]
        (recur (remove-at coll (inc sel))
               (dec n)
               (conj res (nth coll sel)))))))
