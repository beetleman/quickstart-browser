(ns starter.router.routes)

(def app ["/" {""          :index
               "foo"       :foo
               "bar"       :bar
               ["baz/" :id] :baz}])
