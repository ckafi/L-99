; Generate a random permutation of the elements of a list
(defn remove-at [coll n]
  (concat (take (dec n) coll) (drop n coll)))

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

(defn rnd-permu [coll]
  (rnd-select coll (count coll)))
