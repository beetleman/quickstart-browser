(ns starter.fixtures
  (:require [jsdom :refer [JSDOM]]
            [goog.object :as gobj]))

(defn mock-dom []
  (let [jsdom     (JSDOM. "" #js {:pretendToBeVisual true})
        window    (.. jsdom -window)
        document  (.. window -document)
        navigator #js {:userAgent "node.js"}]
    (gobj/set js/global "window" window)
    (gobj/set js/global "document" document)
    (gobj/set js/global "navigator" navigator)
    (gobj/extend js/global window)))


(mock-dom)

(def restore-dom {:after mock-dom})
