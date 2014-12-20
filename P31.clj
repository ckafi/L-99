; Determine whether a given integer number is prime.
(defn is-prime [n]
  (let [upper-limit (Math/floor (Math/sqrt n))]
    (every? false? (map #(zero? (rem n %)) (range 2 (inc upper-limit))))))
