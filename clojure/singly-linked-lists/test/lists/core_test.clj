(ns lists.core-test
  (:require [clojure.test :refer :all]
            [lists.core :refer :all])
  (:import [lists.core Node]))

(deftest node-tests
  (testing "should be able to create a Node object"
    (is (not= (type Node) nil)))
  
  (testing "should properly pass 1 to car for a node"
    (is (= 1 (let [node (Node. 1 2)] (.getCar node)))))

  (testing "should properly pass 2 to cdr for a node"
    (is (= 2 (let [node (Node. 1 2)] (.getCdr node)))))

  (testing "car should be volatile"
    (is (= true ((meta (Node. 1 2)) :volatile-mutable)))))
