; Run-length encoding of a list
(defn encode [coll]
  (map #(list (count %) (first %))
       (partition-by identity coll)))
