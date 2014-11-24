; Reverse a list
(defn my-reverse [coll]
  (reduce #(cons %2 %1) '() coll))
