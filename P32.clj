; Determine the greatest common divisor of two positive integer numbers
(defn gcd [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))
