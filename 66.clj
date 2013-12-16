; Problem 66
; Greatest Common Divisor
; Euclid's algorithm
(fn gcd [a b]
  (if (zero? b)
    a
    (gcd b (mod a b))))
