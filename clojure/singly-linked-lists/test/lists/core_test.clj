(ns lists.core-test
  (:require [clojure.test :refer :all]
            [lists.core :refer :all])
  (:import lists.core.Node))

(deftest node-tests
  (testing "should be able to create a Node object"
    (is (not= (type Node) nil))))
