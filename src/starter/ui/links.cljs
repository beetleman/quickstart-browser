(ns starter.ui.links
  (:require [starter.router.routes :as routes]
            [starter.ui.buttons :as buttons]
            [bidi.bidi :as bidi]))

(defn primary [txt to & params]
  (let [path (apply bidi/path-for routes/app to params)]
    [buttons/primary {:href path}
     txt]))
