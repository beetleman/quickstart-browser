(ns starter.events
  (:require
   [starter.db    :refer [default-db]]
   [re-frame.core :refer [reg-event-db reg-event-fx inject-cofx path after]]
   [cljs.spec.alpha :as s]))

(defn check-and-throw
  "Throws an exception if `db` doesn't match the Spec `a-spec`."
  [a-spec db]
  (when-not (s/valid? a-spec db)
    (throw (ex-info (str "spec check failed: " (s/explain-str a-spec db)) {}))))

(def check-spec-interceptor (after (partial check-and-throw :starter.db/db)))



;; route
(def route-interceptors [check-spec-interceptor
                        (path :route)])

(defn set-route [_ [_ route]]
  route)

(reg-event-db
 :set-route
 route-interceptors
 set-route)


;; init
(reg-event-db
 :initialise-db
 [check-spec-interceptor]
 (fn [_ _]
   default-db))
