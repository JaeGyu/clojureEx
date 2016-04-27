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



