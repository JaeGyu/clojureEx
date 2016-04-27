(*)

{:jam1 "ff"}

{"a" "a"}

{"1" 1}

{"key" "value"}

{:key "value"}

{:a "a", :b "b"}


(get {"name" "ejb"} "name")

(println (get {:name "ejb"} :name))


(get {:a "a" :b "b"} :c "not found")


;키워드를 함수 처럼 사용해서 map에서 값을 가져 올 수 있다.
(:jam2 {:jam1 "strawberry" :jam2 "blackberry" :jam3 "marmalade"})

(keys {:jam1 "aa" :jam2 "bb"})

(vals {:jam1 "aa" :jam2 "bb"})

(assoc {:a "1" :b "2"} :c "3")

;아래는 {:a "1"} 의 맵에서 :a "2" 로 바뀐 새로운 맵을 만든다.
(assoc {:a "1"} :a "2")

(dissoc {:a "1"} :a)

(dissoc {:a "1" :b "2"} :b)

(println (dissoc {:a "1" :b "2"} :b))

;merge는 여러 map를 합친다.
;동일한 키는 마지막 것으로 합쳐진다.
(merge {:a "1"}
       {:b "2"}
       {:a "11"}
       {:c "3"}
       {:a "111"})

;아래는 집합을 표현한다.
#{:red :blue}

(count #{:a :b})

(count {:a "1"})

(count '(1))

(count [1])

;집합을 표현할때 중복으로 값이 있으면 예외발생 함

(def a "1")

(println a)

(def a #{:r :b :w})
(def b #{:w :p :y})

;집합연산을 사용하기 위해서는 아래와 같이 clojure.set를 붙여 준다.
(clojure.set/union a b)
(clojure.set/difference a b)
(clojure.set/intersection a b)

(count (clojure.set/union a b))























