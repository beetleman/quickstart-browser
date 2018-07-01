(ns starter.pages.main
  (:require [starter.router.core :refer [page-handler]]
            [starter.ui.hero :refer [hero]]))

(defmethod page-handler :index [_]
  [:section
   [hero "Main"]])
