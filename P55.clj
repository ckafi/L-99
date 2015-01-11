; Construct completely balanced binary trees
(defn cbal-tree [n]
  (if (zero? n)
    nil
    (let [left-size (int (/ (dec n) 2))
          right-size (if (even? (dec n)) left-size (inc left-size))]
      (println left-size right-size)
      (list \x (cbal-tree left-size) (cbal-tree right-size)))))
