; Given a range of integers by its lower and upper limit, print a list of all
; even numbers and their Goldbach composition.
(defn goldbach-list [start end]
  (map #(let [g (goldbach %)] (println % "=" (first g) "+" (last g)))
       (filter even? (range start (inc end)))))
