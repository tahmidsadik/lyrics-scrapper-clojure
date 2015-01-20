(ns scrapper.core
  (:gen-class)
  (:require [net.cgrand.enlive-html :as html]
            [clojure.string :as str])
  (:import (java.net URL)))
(def base-url "http://www.lyrics71.com/eka-একা-2/")

(defn fetch-url [url]
  (html/html-resource (URL. url)))

(def html-doc (fetch-url base-url))

(defn get-lyric []
  (map html/text (html/select html-doc [:div.content-post])))
(def lyric (first (get-lyric)))
(str/split lyric #"\n")

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (fetch-url base-url)))
