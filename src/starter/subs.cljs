(ns starter.subs
  (:require [re-frame.core :refer [reg-sub subscribe]]))

(defn route [db _]
  (get db :route))
(reg-sub :route route)

(defn path [route _]
  (get route :path))
(reg-sub
 :path
 (fn [_ _] (subscribe :route))
 path)
