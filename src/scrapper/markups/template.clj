(ns scrapper.markups.template
  (:require [hiccup.page :as page]))

(defn template-markup [& body]
  (page/html5
              [:head
                [:title "Scrapper process viewer for L71"]
                (page/include-css "/css/l71.css")]
              [:body.wrapper body]))
