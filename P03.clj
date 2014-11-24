; Find the K'th element of a list
(defn element-at [coll n]
  (first (drop n coll)))
