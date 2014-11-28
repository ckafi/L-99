(defn remove-at [coll n]
  (concat (take (dec n) coll) (drop n coll)))
