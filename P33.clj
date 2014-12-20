; Determine whether two positive integer numbers are coprime
(load-file "P32.clj")
(defn coprime? [a b]
  (= 1 (gcd a b)))
