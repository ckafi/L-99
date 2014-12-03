; Duplicate the elements of a list
(defn dupli [coll]
  (mapcat #(list % %) coll))
