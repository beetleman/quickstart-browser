(ns starter.pages.page
  (:require [starter.router.core :refer [page-handler]]
            [starter.ui.hero :refer [hero]]))

(defmethod page-handler :page [{{id :id} :route-params}]
  [:section
   [hero "News" (str "page: " id)]])
