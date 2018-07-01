(ns starter.ui.links
  (:require [starter.router.routes :as routes]
            [starter.ui.buttons :as buttons]
            [bidi.bidi :as bidi]))

(defn create-link [component]
  (fn [txt to & params]
    (let [path (apply bidi/path-for routes/app to params)]
      [component {:href path}
       txt])))

(def primary (create-link buttons/primary))
(def navbar (create-link :a.navbar-item))
