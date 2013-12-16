; Problem 40
; Interpose a Seq
(fn [n xs]
  (butlast (interleave xs (repeat (count xs) n))))

