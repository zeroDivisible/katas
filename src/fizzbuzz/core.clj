(ns fizzbuzz.core
  (:gen-class))

(defn generate-numbers [limit]
  (range 1 limit))


(defn fizz [col]
  (map #(if (and (integer? %) (= 0 (mod % 3))) "Fizz" %) col))

(defn buzz [col]
  (map #(if (and (integer? %) (= 0 (mod % 5))) "Buzz" %) col))

(defn fizzbuzz [col]
  (buzz (fizz col)))

