(defproject scrapper "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2665"]
                 [ring "1.3.2"]
                 [compojure "1.3.2"]
                 [hiccup "1.0.5"]
                 [com.novemberain/monger "2.0.0"]
                 [enlive "1.1.5"]]

  :plugins [[lein-cljsbuild "1.0.4"]
            [lein-ring "0.9.1"]]

  :ring {:handler scrapper.handler/handler}

  :cljsbuild {:builds [{:source-paths ["src-cljs"]
                        :compiler {:output-to "resources/public/js/main.js"
                                   :optimizations :whitespace
                                   :pretty-print false}}]}

  :main ^:skip-aot scrapper.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
