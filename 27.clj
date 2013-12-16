; Problem 27
; Palindrome Detector
(fn [xs] 
  (let [half (/ (count xs))]
    (= (take half xs) (reverse (take-last half xs)))))
