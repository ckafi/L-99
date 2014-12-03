; Generate the combinations of K distinct objects chosen from the N elements of
; a list
(defn combinations [n coll]
  (if (= 1 n)
    (map list coll)
    (mapcat #(map (partial cons (nth coll %)) 
                  (combinations (dec n) (drop (inc %) coll)))
            (range (count coll)))))
