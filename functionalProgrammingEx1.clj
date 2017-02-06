(*)

(* 7 8)

(def meaning-of-life 42)

(* meaning-of-life 3)

(if (< meaning-of-life 0) "negative" "non-negative")

(if (= "a" "a") (* 3 3) (+ 3 3))

(def droids ["a","b","c"])

(count droids)

(* 1)

(+ 1)

(droids 0)

(def me {:name "gg" :age 42})

(:age me)

(:k me)

(defn percentage [x p] (* x (/ p 100.0)))

(percentage 200 10)

(percentage 2000 23)

(percentage 1000 1)

(defn recursive-sum [numbers]
  (if (empty? numbers)
    0
    (+ (first numbers) (recursive-sum (rest numbers))))
  )

(recursive-sum [1,2,3])


(reduce + [1 2 3])

(reduce (fn [a b] (* a b)) 2 [3 4])


(defn reduce-sum [numbers]
  (reduce (fn [a b] (+ a b)) 0 numbers))

(reduce-sum  [1 2 3 4 5 6 7 8 9 10])

(defn sum [numbers]
  (reduce + numbers))

(sum [1 2 3 4 5 6 7 8 9 10])

(ns sum.core
  (:require [clojure.core.reducers :as r]))

(defn parallel-sum [nums]
  (r/fold + nums))

(parallel-sum [1 2 3 4 5 6 7 8 9 10])








