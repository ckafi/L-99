(defn dupli [coll]
  (mapcat #(list % %) coll))
