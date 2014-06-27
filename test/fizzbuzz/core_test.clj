(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))


(deftest generate-numbers-function
  (testing "should return numbers from 1 to 100"
    (is (map = generate-numbers (range 1 101)))))


