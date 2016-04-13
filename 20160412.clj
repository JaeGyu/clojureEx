
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

(#(+ %1 %2) 1 2)

(#(println %) "Hello World")

(defn add [x y] (+ x y))

(add 1 2)

(defn add "더하기 입니다." [x y] (+ x y))

(defn add "더하기 함수 입니다. \n사용 방법은 아래와 같습니다.\nex) (add 1 2)" [x y] (+ x y))

(doc add)

(add 9 9)

;mul함수에서 x,y를 파라매터로 받고 있지만
;함수의 body에서 let을 사용해서 무조건 x=1,y=1로 세팅되게 하고 있다.
(defn mul [x y] (let [x 1 y 1] (* x y)))

(mul 1 2)

(let [a 1 b 3] (+ a b))

(def a 1)
(def b 2)
(let [a 10 b 20] (+ a b))

(defn apply_one_two [f] (f 1 2))

(defn mul [x y] (* x y))

(apply_one_two mul)

(defn increase [x] (+ x 1))

(increase 3)

(defn get_increase_function [] increase)

((get_increase_function) 1)

(increase ((fn [x] (+ x 1)) 1))

(defn put_two_number [f,x,y] (f x y))

(put_two_number mul 2 3)

(#(+ %1 %2) 1 2)

(put_two_number #(+ %1 %2) 4 5)

(put_two_number (fn [x y] (* x y)) 4 5)

((fn [] (str "gg")))



















