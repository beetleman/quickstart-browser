(ns starter.router.routes)

(def app ["/" {""            :index
               "about"       :about
               ["page/" :id] :page}])
