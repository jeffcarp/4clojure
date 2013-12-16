; Problem 33
; Replicate a Sequence
(fn [xs num]
  (if (= num 1)
    xs
    (apply interleave (repeat num xs))))
