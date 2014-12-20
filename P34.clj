; Calculate Euler's totient function phi(m)
(load-file "P33.clj")
(defn totient-phi [m]
  (if (= 1 m)
    1
    (count (filter true? (map (partial coprime? m) (range 1 m))))))
