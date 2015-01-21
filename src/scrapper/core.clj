(ns scrapper.core
  (:gen-class)
  (:require [net.cgrand.enlive-html :as html]
            [clojure.string :as str])
  (:import (java.net URL)))

(def base-url "http://www.lyrics71.com/eka-একা-2/")

(defn fetch-url [url]
  (html/html-resource (URL. url)))

(defn parse-lyric [string]
  "purges newline chars, whitespace and unicode dots('...') from lyric"
  (str/replace string #"\…|\." ""))

(defn find-lyric [page]
  "finds lyric from a Lyric 71 page"
  (first (map html/text (html/select page [:div.content-post]))))

(defn get-lyric [url]
  (parse-lyric (find-lyric(fetch-url url))))
