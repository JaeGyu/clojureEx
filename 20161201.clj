(*)

(not true)

(not nil)

(not "h")

(not 1)

(not (> 1 2))

(> 5 6)

(>= 5 5)

(= :drinkme :drinkme)

(= :drinkme 4)

(= [:a] '(:a))

(= [:a] #{:a})

(if true 1 2)

(if false 1 2)

(= true (not false))

(empty? [])

(empty? [1])

(empty? {})

(empty? {:a 1})

(empty? #{:a})

(empty? #{})

(defn new-empty? [coll]
  (not (seq coll)))


(new-empty? [])


(not '())

(not '(1))

(conj [] "a")

(cons :a nil)

(seq [])

(seq [1 2 3])


(class [])

(class (seq []))

(class (seq [1]))

(class '(1))

(class #{1})

(class (seq #{1}))

(seq #{1})

(seq {:a 1 :b 2})

(count (rest (seq {:a 1 :b 2 :c 3})))

(not (seq '(1)))

(not (seq '()))

(defn aaa [coll]
  (not (seq coll)))

(aaa [1])

(aaa [])

(defn null? [coll]
  (not (seq coll)))

(null? '())

(null? '(1 2 3))

(defn star [n]
  (println n))

(star 2)

(defn rtn [str]
  str)

(rtn "hh")

(defn rtn2 [str]
  (println str)
  str)

(rtn2 "g")

(defn rtn3 [str]
  str ;무시 되어짐
  (println str))

(rtn3 "h")


(range 10)

(rest (range 11))

(for [n (range 5)]
  n)


(for [n (range 10)]
  (println n))

