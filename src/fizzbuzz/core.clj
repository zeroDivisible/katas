(ns fizzbuzz.core
  (:gen-class))

(defn by3 [number]
  (= 0 (mod number 3)))

(defn by5 [number]
  (= 0 (mod number 5)))

(defn fizzbuzz [col]
  (map #(if (and (by5 %) (by3 %)) "FizzBuzz" 
            (if (by5 %) "Buzz" 
            (if (by3 %) "Fizz" %)))
       col))


