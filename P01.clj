; Find the last box of a list
(defn my-last [coll]
  (first (drop (dec (count coll)) coll)))
