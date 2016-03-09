(*)

(str "Hello" " " "world")

(println "hello")

(println (format "3 + 4 = %d" (+ 3 4)))

(count (list 2 3 4))

(count "hello")

(count "ggg")

(= "Counter" "Counter")

(= "Counter" "counter")

(= "abc" (str "a" "b" "c"))

(identical? "abc" "abc")

; 주소값으로 비교 하는 것 같음
; 두개의 객체가 같은 객체인지를 비교함 동일성 비교
(identical? "abc" (str "a" "b" "c"))


;identical 연습

(def x 1)

(identical? x x)


; x 와 1이 동일 한지 물어 본다.
; 1이란 상수가 한번 메모리 상에 생성이 되면 같이 사용 하는 것 같다. 싱글톤
(identical? x 1)

(identical? x 2)

(identical? x ((constantly 1) 8))

;constantly : Returns a function that takes any number of arguments and returns x.
(constantly 1)


(def boring (constantly 10))

(boring 1)

(boring "a")

(boring 1 2 3)

(def x {:foo 1, :bar -3})
(def y {:foo 1, :bar -3})

(= x y)
;값은 같아서 위에처럼 동등성비교는 true지만 서로 다른 주소를 가지고 있는 객체이기 때문에
;동일성 비교는 false이다.
(identical? x y)

;아래의 결과는 왜 그런건지 모르겠음
;-128 ~ 127 범위 안에서만 되는 거 같음
(identical? 128 128)
(identical? 127 127)
(identical? -127 -127)
(identical? -130 -130)
(identical? 5 5)
(identical? 1000 1000)
(identical? -128 -128)
(identical? -129 -129)



'(0 1 2 3)

'(0 10)

(list '(0 1 2))

(list '(0) '(0 1) ' (0 1 2))


(= (list 0 1 2) '(0 1 2))

(identical? (list 0 1 2) '(0 1 2))

(first '(0 1 2))

(second '(0 1 2))

(first (list 0 1 2))

(last '(0 1 2))

(rest '(0 1 2))

(rest '(1 2 3 4 5))

(count '(0 1 2))

;벡터도 리스트 함수를 사용 할 수 있다.
[0 1 2]

(first [0 1 2])
(second [0 1 2])
(rest [0 1 2])
(count [0 1 2])


{"id" 1, "name" "jaegyu"}


