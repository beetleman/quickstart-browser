(ns starter.db
  (:require [cljs.spec.alpha :as s]
            [re-frame.core :as re-frame]))

(s/def ::route-params map?)
(s/def ::path string?)
(s/def ::handler keyword?)
(s/def ::route (s/keys :req-un [::path ::handler]
                       :opt-un [::route-params]))
(s/def ::db (s/keys :req-un [::route]))

(def default-db
  {:route {:path "/"
           :handler :index}})
