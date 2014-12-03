; Generate a random permutation of the elements of a list
(load-file "P23.clj")
(defn rnd-permu [coll]
  (rnd-select coll (count coll)))
