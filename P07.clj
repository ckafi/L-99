; Flatten a nested list structure
(defn my-flatten [coll]
  (if (not (sequential? coll)) [coll]
    (mapcat my-flatten coll)))
