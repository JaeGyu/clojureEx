(*)

;conj 함수는 컬렉션에 하나 이상의 요소를 추가하는데
; 컬렉션의 데이터 구조에 가장 효율적인 방식으로 추가한다.
;벡터의 경우 conj는 컬렉션의 맨 뒤에 요소를 추가한다.
;list인 경우 컬렉션의 맨앞에 추가를 한다.
(conj [:toast :butter] :jam)

(conj '(1 2 3) 4)

(conj [:a :b :c] :d :e)

(conj '(:a :b :c) :d :e)

(cons :a '())
(cons :a '())


{"g" 1}

{:g 1}




