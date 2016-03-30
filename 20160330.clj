
(*)

[0 1 2]


{"id" 1}


(println [0 1 2])

(get {"id" 2000242103 "name" "한재규"} "name")

(println (get
          (assoc {"name" "한재규"} "age" 36)
          "age"))

(get
  (assoc {"age" 11} "age" 33)
   "age")

(clojure-version)

(get {:name "한재규" :age 36} :name)

(assoc {:name "abc"} "age" 44)

(keyword "id")

(str "a" "b")

(identical? "ab" "ab")

(identical? "ab" (str "a" "b"))

;문자열과는 다르게 키워드는 항상 같은 인스턴스를 가리킨다.
(identical? :id (keyword (str "i" "d")))

(println #{3 2 1})

(:id #{:id :a :b})

(get #{"ab" "cc"} "cc")

(get #{"ab" "cc"} "dd")

(contains? #{"a" "b"} "b")

(contains? [1 2 3] 3)













