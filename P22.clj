; Create a list containing all integers within a given range
(defn my-range [start end]
  (take (- end start) (iterate inc start)))
