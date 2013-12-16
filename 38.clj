; Problem 38
(fn mymax
  ([] nil)
  ([x] x)
  ([x & args]
    (if (> x (apply mymax args))
      x 
      (apply mymax args))))
