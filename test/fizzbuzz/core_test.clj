(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest it-should-print-100-numbers
  (testing "should print numbers from 1 to 100"
    (is (= generate-numbers (range 1 101)))))
