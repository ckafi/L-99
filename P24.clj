; Lotto: Draw N different random numbers from the set 1..M
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

(defn my-range [start end]
  (take (- end start) (iterate inc start)))

(defn lotto-select [n m]
  (rnd-select (my-range 1 (inc m)) n))
