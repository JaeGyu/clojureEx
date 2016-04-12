
(*)

(def a 1)

(println a)


(def a 2)

(println a)

(identical? a (def a 3))


(def a "A value." 1)

(doc a)

(doc +)

(doc identical?)

(doc -)

(doc list)

(doc assoc)

(doc cons)

(doc conj)

(cons 2 '(1 2 3))

(conj '(1) 2 3)

(conj [1 2 3] 3 4 5)

(cons 2 [1 2 3])

(def x 1)

(def y 2)

(+ x y)

(def a 1)

(let [b 2 c 3] (+ b c))

(println a)

(let [b 2] (+ a b))

(doc let)

;(let 바인딩벡터 본문)
;바인딩 벡터 : [심볼 값 심볼 값 ... ]
(let [a 2 b 3] (+ a b))

(println a)

(def ^:dynamic a 1)

(binding [a 2] (+ a 1))

(println a)

(def a 1)

(let [a 2] (+ a 1))

a

;dynamic var 와 let의 차이점?

(def ^:dynamic *a* 1)

(binding [*a* 2] (+ *a* 1))


;함수

((fn [x y] (+ x y)) 1 2)

((fn [] nil))

((fn [x] nil) 1)

((fn [] (str "ff")))

((fn [x] (str x ".....")) "ff")


















