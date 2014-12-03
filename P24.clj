; Lotto: Draw N different random numbers from the set 1..M
(load-file "P22.clj")
(load-file "P23.clj")
(defn lotto-select [n m]
  (rnd-select (my-range 1 (inc m)) n))
