(ns lists.core
  (:gen-class))

(definterface INode
  (getCar [])
  (setCar [x])
  (getCdr [])
  (setCdr [x]))


(deftype Node [^:volatile-mutable car ^:volatile-mutable cdr] INode
  (getCar [this] car)
  (setCar [this x] (set! car x) this)
  (getCdr [this] cdr)
  (setCdr [this x] (set! cdr x) this))
