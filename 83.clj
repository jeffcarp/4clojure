; Problem 83
; A Half-Truth
(fn [& args]
  (let [numtrue (count (filter true? args))]
    (and (> (count args) numtrue) (> numtrue 0))))
