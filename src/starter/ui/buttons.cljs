(ns starter.ui.buttons)

(defn primary [txt]
  [:a.button.is-primary
   txt])

(defn primary-large [txt]
  [:a.button.is-primary.is-large
   txt])
