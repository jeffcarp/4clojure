; Problem 30
; Compress a Sequence
(fn compress [xs]
  (cond
    (empty? xs)
      []
    (= 1 (count xs))
      [(first xs)]
    :else
      (if (= (first xs) (second xs))
        (compress (rest xs)) 
        (cons (first xs) (compress (rest xs))))))
