; Problem 32
; Duplicate a Sequence
(fn dup [xs]
  (if (nil? xs)
    '()
    (concat (dup (butlast xs)) (list (last xs) (last xs)))))
