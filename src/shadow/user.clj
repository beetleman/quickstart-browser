(ns shadow.user
  (:require [shadow.cljs.devtools.api :as shadow]))

(defn cljs-repl []
  (shadow/nrepl-select :app))
