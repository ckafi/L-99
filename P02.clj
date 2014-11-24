; Find the last but one box of a list
(defn my-but-last [coll]
  (if (= 1 (count coll)) nil
    (first (drop (- (count coll) 2) coll))))
