(ns trying-out-re-frame.subs
    (:require-macros [reagent.ratom :refer [reaction]])
    (:require [re-frame.core :as re-frame]))

(re-frame/register-sub
 :count
 (fn [db]
   (reaction (:count @db))))
