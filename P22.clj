(defn my-range [start end]
  (take (- end start) (iterate inc start)))
