; Problem 39
; Interleave Two Seqs
(fn myinter [one two]
  (if (or (empty? one) (empty? two))
    []
    (cons (first one) (cons (first two) (myinter (rest one) (rest two))))))
