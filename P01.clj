; Find the last box of a list
(defn my-last [coll]
  (cond (zero? (count coll)) nil
        (= 1 (count coll)) (first coll)
        :else (recur (rest coll))))
