; Write a predicate symmetric/1 to check whether a given binary tree is
; symmetric
(defn mirror [tree1 tree2]
  (cond 
    (and (nil? tree1) (nil? tree2)) true
    (or (nil? tree1) (nil? tree2)) false
    :else (and (mirror (second tree1) (last tree2))
               (mirror (last tree1) (second tree2)))))

(defn symmetric [tree]
  (if (nil? tree)
    true
    (mirror (second tree) (last tree))))
