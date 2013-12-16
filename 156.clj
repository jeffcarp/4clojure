; Problem 156
(fn [default mapkeys]
  (zipmap mapkeys (repeat (count mapkeys) default)))
