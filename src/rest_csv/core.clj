(ns rest-csv.core
  (:require [ring.adapter.jetty :as jetty]
            [hugsql.core :as hugsql]))

(def db (System/getenv "DATABASE_URL"))
(def db "jdbc:postgresql://localhost/restcsv")

(hugsql/def-db-fns "rest_csv/database.sql")

(defn create-endpoint [db]
  (:id (create-endpoint* db)))

(defn app [req]
  {:headers {}
   :status 200
   :body "Hello World"})


(defn -main []
  (jetty/run-jetty app
                   {:port 8080}))
