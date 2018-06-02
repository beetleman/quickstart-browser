(ns starter.browser
  (:require [reagent.core :as reagent]))

(defn button [txt]
  [:a.button.is-primary.is-large
   txt])

(defonce dev-counter (reagent/atom 0))

(defn ui []
  [:div.container.is-fluid {:key @dev-counter}
   [button "Hello world"]])

(defn render []
  (reagent/render [ui]
                  (js/document.getElementById "app")))

;; start is called by init and after code reloading finishes
(defn ^:dev/after-load start []
  (let [text (if (zero? @dev-counter)
               "start"
               (str "start, HMR nr: " @dev-counter))]
    (js/console.log text)
    (swap! dev-counter inc)))

(defn ^:export init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "init")
  (start)
  (render))

;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
  (js/console.log "stop"))
