(defn compress [coll]
  (map first (partition-by identity coll)))
