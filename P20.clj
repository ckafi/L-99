; Remove the K'th element from a list
(defn remove-at [coll n]
  (concat (take (dec n) coll) (drop n coll)))
