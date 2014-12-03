; Modified run-length encoding
(load-file "P10.clj")
(defn encode-modified [coll]
  (map #(if (= 1 (first %)) (last %) %) (encode coll)))
