; Calculate Euler's totient function phi(m) (improved)
(load-file "P36.clj")
(defn totient-phi-imp [n]
  (apply * (map (fn [[p m]] (* (dec p) (Math/pow p (dec m))))
                (prime-factors-mult n))))
