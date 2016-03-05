(ns trying-out-re-frame.core
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]
              [trying-out-re-frame.handlers]
              [trying-out-re-frame.subs]
              [trying-out-re-frame.views :as views]
              [trying-out-re-frame.config :as config]))

(when config/debug?
  (println "dev mode"))

(defn mount-root []
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init [] 
  (re-frame/dispatch-sync [:initialize-db])
  (mount-root))
