(ns starter.router.core
  (:require [bidi.bidi :as bidi]
            [accountant.core :as accountant]
            [re-frame.core :refer [dispatch]]
            [starter.router.routes :as routes]
            [mount.core :refer [defstate]]))


(defn nav-handler [path]
  (let [match (or (bidi/match-route routes/app path)
                  {:handler :not-found})]
    (dispatch [:set-route (merge match {:path path})])))

(defn path-exists? [path]
  true)

(defn dispatch-current! []
  (accountant/dispatch-current!))

(defstate router
  :start (accountant/configure-navigation! {:nav-handler  nav-handler
                                            :path-exists? path-exists?}))
