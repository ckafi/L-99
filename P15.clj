; Replicate the elements of a list a given number of times
(defn repli [coll n]
  (mapcat #(repeat n %) coll))
