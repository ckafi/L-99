; Write a predicate to find the two prime numbers that sum up to a given even
; integer.
(load-file "P39.clj")
(defn goldbach [n]
  (let [primes (prime-range 2 n)
        pairs (for [x primes y primes] [x y])]
    (first (filter (comp (partial = n) (partial apply +)) pairs))))
