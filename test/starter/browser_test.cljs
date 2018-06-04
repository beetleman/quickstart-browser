(ns starter.browser-test
  (:require [clojure.test :refer [deftest is testing use-fixtures]]
            [starter.fixtures :as fixtures]
            [starter.browser :as browser]))

(use-fixtures :once ;; we need it because of `accountant`
  fixtures/restore-dom)

(deftest exported-function
  (testing "start"
    (is (fn? browser/start))
    (is (-> #'browser/start
            meta
            :dev/after-load)))

  (testing "stop"
    (is (fn? browser/stop))
    (is (-> #'browser/stop
            meta
            :dev/before-load)))

  (testing "init"
    (is (fn? browser/init))))
