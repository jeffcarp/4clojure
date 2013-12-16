; Problem 28
; Flatten a Sequence
(fn myflat [xs]
  (cond
    (empty? xs)
      []
    (or (list? (first xs)) (vector? (first xs)))
      (do 
        (println (first xs) "list")
        (conj (myflat (first xs)) (myflat (rest xs))))
    :else
      (do
        (println xs "scalar")
        xs)))
