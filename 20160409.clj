
(*)

[:jar 1 2 3 :jar2]

[:f :f]

(first [1 2 3])

(rest [1 2 3])

(rest [])

(rest [1])

(rest [nil nil])

(rest [1 2 '(1 2 3)])

(rest [1 2 '(1 2) (rest [1 2 3 '(1 2 3)])])



