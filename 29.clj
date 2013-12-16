; Problem 29
; Get the Caps
#(clojure.string/join "" (re-seq #"[A-Z]" %))
