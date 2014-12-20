; Determine the prime factors of a given positive integer
(load-file "P31.clj")
(defn prime-factors 
  ([n]
   (prime-factors 
     n 
     (filter is-prime (filter #(zero? (mod n %)) (range 2 n)))))
  ([n primes]
   (if (is-prime n)
     (list n)
     (let [cand (first primes)]
       (if (zero? (mod n cand))
         (conj (prime-factors (/ n cand) primes) cand)
         (recur n (rest primes)))))))
