(ns scrapper.markups.l71
  (:require [scrapper.markups.template :as tmpl]))

(defn home []
  (tmpl/template-markup [:h3 "Lyrics 71 scrapper" ]
                        [:form#form {:method "GET" :onsubmit "return false;"}
                          [:label {:for "lyric"}]
                          [:input {:type "url" :name "url" :id "url" :placeholder "Enter a url from Lyrics71 page containing lyric"}]]
                        [:script {:src "js/main.js"}]))


