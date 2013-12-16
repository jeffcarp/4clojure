; Problem 41
; Drop Every Nth Item
(fn [xs drop]
  (keep-indexed #(if-not (= 0 (mod (inc %1) drop)) %2) xs))
