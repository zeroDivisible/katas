(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))


(deftest generate-numbers-function
  (testing "should return numbers from 1 to 100"
    (is (= (generate-numbers 101) (range 1 101))))

  (testing "should replace numbers divisible by 3 with Fizz"
    (is (= (fizz (generate-numbers 11))
           (list 1 2 "Fizz" 4 5 "Fizz" 7 8 "Fizz" 10)))))


