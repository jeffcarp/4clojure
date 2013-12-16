; Problem 26
; Fibonacci Sequence
(fn [num]
  (take num (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1]))))
