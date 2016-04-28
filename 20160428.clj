(*)

(def a #{:a :b :c})

a

(def b #{:a})

(clojure.set/union a b)

(clojure.set/difference a b)

(clojure.set/difference b a)

(clojure.set/intersection a b)

(def c #{{:a "a" :b "b"} {:c "c" "d" "d"} [1 2 3 #{:a :b :c}]})

(count (clojure.set/union a b c))

(clojure.set/union a b c)

;set를 통해 다른 종류의 컬렉션을 집합으로 변경 할 수 있다.
(set [:a :b])

(set {:a "a" :b "b"})

(set '(1 2 3))

(set #{:a :b})

(set #{1 2 3})


