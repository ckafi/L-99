(defn repli [coll n]
  (mapcat #(repeat n %) coll))
