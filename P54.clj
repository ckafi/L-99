; Write a predicate istree which returns true if and only if its argument is a
; list representing a binary tree.
(defn istree? [tree]
  (or (nil? tree)
      (and (sequential? tree)
           (= 3 (count tree))
           (istree? (second tree))
           (istree? (last tree)))))
