(ns trying-out-re-frame.handlers
    (:require [re-frame.core :as re-frame]
              [trying-out-re-frame.db :as db]))

(re-frame/register-handler
 :initialize-db
 (fn  [_ _]
   db/default-db))

(re-frame/register-handler
  :increment-count
  (fn [app-state _]
    (update-in app-state [:count] inc)))

(re-frame/register-handler
  :decrement-count
  (fn [app-state _]
    (update-in app-state [:count] dec)))