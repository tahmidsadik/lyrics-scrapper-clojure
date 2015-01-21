(ns scrapper.handler
  (:require [ring.middleware.resource :refer [wrap-resource]]
            [ring.middleware.params :refer [wrap-params]]
            [compojure.core :refer [defroutes routes GET POST]]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [scrapper.markups.l71 :as markup]
            [scrapper.core :as scraper]))

(defn init []
  (println "prereg-planner-clojure is starting"))

(defn destroy []
  (println "prereg-planner-clojure is shutting down"))

(defroutes app-routes
  (GET "/" [] (markup/home ))
  (GET "/scrape/" [link] (scraper/get-lyric link))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app (wrap-params (handler/site (routes app-routes))))
