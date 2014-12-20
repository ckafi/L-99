; Given a range of integers by its lower and upper limit, construct a list of
; all prime numbers in that range
(load-file "P31.clj")
(defn prime-range [start end]
  (filter is-prime (range start (inc end))))
