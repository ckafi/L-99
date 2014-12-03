; Modified run-length encoding
(defn encode [coll]
  (map #(list (count %) (first %))
       (partition-by identity coll)))

(defn encode-modified [coll]
  (map #(if (= 1 (first %)) (last %) %) (encode coll)))
