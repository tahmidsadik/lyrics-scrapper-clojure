(ns scrapper.core
  (:gen-class)
  (:require [net.cgrand.enlive-html :as html]
            [clojure.string :as str])
  (:import (java.net URL)))

(def base-url "http://www.lyrics71.com/eka-একা-2/")
(def html-doc (fetch-url base-url))

(defn fetch-url [url]
  (html/html-resource (URL. url)))

(defn parse-lyric [string]
  "purges newline chars, whitespace and unicode dots('...') from lyric"
  (str/replace string #"\…|\n|\." ""))
dfdfdf