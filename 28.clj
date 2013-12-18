; Problem 28
; Flatten a Sequence

; Had to cheat - peeked at Clojure's implementation of flatten
; http://clojuredocs.org/clojure_core/1.2.0/clojure.core/flatten 

(fn [xs]
  (filter (complement sequential?)
          (rest (tree-seq sequential? seq xs))))

; compement
  ; returns a function that returns the logical opposite of the original function given the same params

; sequential?
  ; is this a sequence?

; tree-seq
  ; does a DFS, returning all steps along the way 

; seq
  ; converts a collection into a sequence
