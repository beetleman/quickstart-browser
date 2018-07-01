(ns starter.pages.core
  (:require [starter.ui.buttons :as buttons]
            [starter.ui.links :as links]
            [starter.ui.navbar :refer [navbar]]
            [starter.router.core :refer [current-page page-handler]]
            [starter.pages.main]
            [starter.pages.about]
            [starter.pages.page]))

;; 404 like
(defmethod page-handler :default [{path :path}]
  [:div "handler not find for path: '" path "'"])

(defn menu []
  [navbar
    [links/navbar "main" :index]
    [links/navbar "about" :about]
    [links/navbar "news" :page :id 1]])

(defn main []
  [:div
   [menu]
   [:main
    [current-page]]])
