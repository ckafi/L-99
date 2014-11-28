(defn slice [coll start end]
  (drop (dec start) (take end coll)))
