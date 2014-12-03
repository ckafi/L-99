; Insert an element at a given position into a list
(defn insert-at [elem coll n]
  (concat (take (dec n) coll) (list elem) (drop (dec n) coll)))
