; Decode a run-length encoded list
(defn decode [coll]
  (mapcat #(if (list? %)
          (repeat (first %) (last %))
          (list %))
       coll))
