; Group the elements of a set into disjoint subsets
(load-file "P26.clj")
(defn group3 [coll]
  (for [x (combinations 2 coll)
        y (combinations 3 (remove (set x) coll))
        z (combinations 4 (remove (set (concat x y)) coll))]
    (list x y z)))

(defn group [coll sizes]
  (if (= 1 (count sizes))
    (list coll)
    (apply concat (for [x (combinations (first sizes) coll)]
      (map #(list x %) (group (remove (set x) coll) (rest sizes)))))))
