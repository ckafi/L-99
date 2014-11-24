; Find the number of elements of a list
(defn my-count [coll]
  (reduce + (map (constantly 1) coll)))
