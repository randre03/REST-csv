(ns rest-csv.core
  (:require [ring.adapter.jetty :as jetty]))

(defn app [req]
  {:headers {}
   :status 200
   :body "Hello World"})


(defn -main []
  (jetty/run-jetty app
                   {:port 8080}))
