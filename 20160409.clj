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

;리스트노 인덱스 참조 가능함
(nth '(0 1) 1)

(nth [0 1 2] 2)

(nth [0 1 2 3] 3)

(last [1 2 3])

;리스트 역시 벡터처럼 last연산이 지원된다.
(last '(1 2))

;리스트에서의 인덱스 참조보다
;벡터에서의 인덱스 참조가 훨씬 성능이 좋다.
;리스트에서의 인덱스 연산은 항상 0번인덱스부터
;찾기 시작하는데 벡터의 인덱스 연산은 해당위치로
;바로 찾아 간다.
(nth '(0 1 2) 1)
(nth [0 1 2] 1)








