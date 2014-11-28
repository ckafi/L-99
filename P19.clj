(defn rotate [coll n]
  (concat (drop n coll) (take n coll)))
