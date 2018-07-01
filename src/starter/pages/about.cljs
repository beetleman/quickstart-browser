(ns starter.pages.about
  (:require [starter.router.core :refer [page-handler]]
            [starter.ui.hero :refer [hero]]))

(defmethod page-handler :about [_]
  [:section
   [hero "About"]
   [:div.container.page>div.content
    [:h1 "Lorem ipsum dolor"]
    [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quis orci ut enim ultrices ultrices et non ante. Quisque nec auctor dolor, sed pretium mi. Nam semper elit vitae aliquam finibus. Phasellus posuere molestie ante. Sed vitae erat nibh. Vivamus mi eros, blandit sit amet blandit at, consequat vitae nisl. Vestibulum finibus dolor mi, a vehicula erat ultricies sed. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Aliquam sit amet tellus quis erat sollicitudin efficitur ac eleifend magna."]
    [:h2 "Duis imperdiet"]
    [:p "Duis imperdiet consequat lectus, et consectetur ipsum egestas quis. Fusce ante magna, molestie ut vulputate non, hendrerit nec lacus. Phasellus porta ex molestie viverra rhoncus. Aliquam sodales ante id neque aliquam, quis pulvinar massa blandit. Quisque quis scelerisque leo. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Fusce in consectetur ligula."]
    [:h2 "In nec varius dolor"]
    [:p "In nec varius dolor. Maecenas pretium ante volutpat, blandit eros a, viverra erat. Maecenas a mi dui. Suspendisse gravida sit amet ligula sit amet maximus. Etiam sed gravida sem. Aliquam eget nisi turpis. Maecenas turpis sapien, porta sed elit ut, ultrices dapibus lacus. Maecenas rutrum ullamcorper purus, quis pulvinar dolor consequat eget. Nullam faucibus venenatis ex, at congue odio commodo id."]]])
