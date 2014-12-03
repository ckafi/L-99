; Eliminate consecutive duplicates of list elements
(defn compress [coll]
  (map first (partition-by identity coll)))
