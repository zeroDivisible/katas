(ns fizzbuzz.core
  (:gen-class))

(defn generate-numbers [limit]
  (range 1 limit))


(defn fizz [col]
  (map #(if (= 0 (mod % 3)) "Fizz" %) col))
