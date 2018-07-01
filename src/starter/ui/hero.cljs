(ns starter.ui.hero)

(def hero-emmet :section.is-fullwidth>section.hero.is-primary>:div.hero-body>div.container)

(defn hero
  ([title]
   [hero title nil])
  ([title subtitle]
   [hero-emmet
    [:h1.title title]
    (if subtitle
      [:h2.subtitle subtitle])]))
