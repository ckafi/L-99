; Find the last but one box of a list
(defn my-but-last [coll]
  (cond (zero? (count coll)) nil
        (= 1 (count coll)) nil
        (= 2 (count coll)) (first coll)
        :else (recur (rest coll))))
