(ns starter.ui.buttons)

(defn primary
  ([txt]
   (primary {} txt))
  ([opts txt]
   [:a.button.is-primary opts
    txt]))
