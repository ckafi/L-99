; Rotate a list N places to the left
(defn rotate [coll n]
  (concat (drop n coll) (take n coll)))
