(ns starter.browser
  (:require [reagent.core :as reagent]
            [re-frame.core :refer [dispatch-sync]]
            [stylefy.core :as stylefy]
            [mount.core :as mount]
            [starter.events]
            [starter.subs]
            [starter.pages.core :as pages]
            [starter.router.core :as router]))

(defonce dev-counter (reagent/atom 0))

(defn ui []
  [:div {:class-name @dev-counter} ;; triger changes after code reload
   [pages/main]])

(defn render []
  (reagent/render [ui]
                  (js/document.getElementById "app")))

(mount/defstate styles
  :start stylefy/init)

(mount/defstate db
  :start (do (dispatch-sync [:initialise-db])
             @router/router
             (router/dispatch-current!)))

;; start is called by init and after code reloading finishes
(defn ^:dev/after-load start []
  (let [{started :started} (mount/start)
        text (if (zero? @dev-counter)
               "start"
               (str "start, HMR nr: " @dev-counter))]
    (js/console.log text (clj->js started))
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
  (let [{stopped :stoped} (mount/stop)]
    (js/console.log "stop" (clj->js stopped))))
