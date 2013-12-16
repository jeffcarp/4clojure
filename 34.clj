; Problem 34
; Implement range
(fn [start end] (take (- end start) (iterate inc start)))

