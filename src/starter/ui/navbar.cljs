(ns starter.ui.navbar
  (:require [starter.ui.links :as links]))

(defn navbar [& navbar-start]
  [:nav.navbar.has-shadow.is-spaced
   [:div.container
    [:div.navbar-brand
     [:a.navbar-item
      {:href "/"}
      [:img
       {:alt "modern Bulma based clojurescript project template",
        :src "/img/logo.png"}]]
     [:div.navbar-burger.burger
      [:span]
      [:span]
      [:span]]]
    [:div.navbar-menu
     (into
      [:div.navbar-start]
      navbar-start)
     [:div.navbar-end
      [:a.navbar-item {:href "https://github.com/beetleman/quickstart-browser"}
       [:span.icon>i.fab.fa-github] [:span "github"]]]]]])
