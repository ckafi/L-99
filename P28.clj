; Sorting a list of lists according to length of sublists
(defn lsort [coll]
  (sort-by count coll))

(defn lfsort [coll]
  (let [freq (reduce #(assoc %1 %2 (inc (get %1 %2 0)))
                     {} (map count coll))]
    (sort-by (comp freq count) coll)))
