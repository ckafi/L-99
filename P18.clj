; Extract a slice from a list
(defn slice [coll start end]
  (drop (dec start) (take end coll)))
