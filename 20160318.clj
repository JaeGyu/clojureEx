(*)

:id

(println {:id 2323 :name "jaegyu"})


;아래는 :id 와 같다. 
(keyword "id")

{(keyword "id") 2323 (keyword "name") "jaegyu"}

(= "id" (str "i" "d"))

;문자열은 아래처럼 비교하면 다르다고 나온다.
(identical? "id" (str "i" "d"))

;키워드는 아래와 같이 비교하면 같다고 나온다. 
;같은 이름의 키워드가 많이 생겨도 하나의 인스턴스를 유지한다.
(identical? (keyword "id") (keyword (str "i" "d")))


;아래는 카워드를 함수로 활용했을경우 
;맵에서 자신을 키로 가지는 값을 가져온다.
(:id {:id 2323 :name "jaegyu"})

;아래는 set을 정의 한것이다. 중복된 요소가 있을경우 예외 발생함
#{3 2 1}

(count #{3 2 1})

(println #{1 2 3 4 5 6 7 8 9 10})

(fn [s] (println "hello, " s))


