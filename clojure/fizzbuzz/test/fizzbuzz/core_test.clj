(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest by3-test
  (testing "should return true for 3 being divisible by 3"
    (is (= (by? 3 3) true)))

  (testing "should return false for 2 being divisible by 3"
    (is (= (by? 3 2) false))))


(deftest by5-test
  (testing "should return true for 5 being divisible by 5"
    (is (= (by? 5 5) true)))

  (testing "should return false for 6 being divisible by 5"
    (is (= (by? 5 6) false))))


(deftest fizzbuzz-test
  (testing "should replace numbers divisible by 3 with Fizz and by 5 with Buzz"
    (is (= (fizzbuzz (range 1 11))
           (list 1 2 "Fizz" 4 "Buzz" "Fizz" 7 8 "Fizz" "Buzz"))))

  (testing "should replace numbers divisible by 3 with Fizz and by 5 with Buzz, by 15 with FizzBuzz"
    (is (= (fizzbuzz (range 1 16))
           (list 1 2 "Fizz" 4 "Buzz" "Fizz" 7 8 "Fizz" "Buzz" 11 "Fizz" 13 14 "FizzBuzz")))))

