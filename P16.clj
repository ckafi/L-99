; Drop every N'th element from a list
(defn drpn [coll n]
  (if (> n (count coll))
    coll
    (concat (take (dec n) coll)
            (drpn (drop n coll) n))))
