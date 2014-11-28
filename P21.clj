(defn insert-at [elem coll n]
  (concat (take (dec n) coll) (list elem) (drop (dec n) coll)))
