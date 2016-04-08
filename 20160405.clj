

(*)

(def a 1)

a

(println a)

;a에 매핑된 값을 변경 하는 것이 아니라
;새로운 값과 a를 연결한 새로운 var를 만든다
(def a 2)

(println a)

(def c "c에 대한 설명 입니다." 1)
(doc c)


'(1 2 "jam" :marmalade-jar)

'(1 2 3)
'(1,2,3)

(list 1 2 3)

(cons 2 (cons 1 nil))

(cons 1 '())
