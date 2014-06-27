(ns fizzbuzz.core
  (:gen-class))

(defn by [numb arg]
  (= 0 (mod numb arg)))

(defn fizzbuzz [col]
  (map #(if (by % 15) "FizzBuzz"
            (if (by % 5) "Buzz"
            (if (by % 3) "Fizz" %)))
       col))


