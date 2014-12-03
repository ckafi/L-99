; Split a list into two parts; the length of the first part is given
(defn split [coll n]
  (list (take n coll) (drop n coll)))
