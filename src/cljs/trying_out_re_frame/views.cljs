(ns trying-out-re-frame.views
    (:require [re-frame.core :as re-frame]))

(defn count-display []
  (let [count (re-frame/subscribe [:count])]
    (fn []
      [:h3.section-heading
       (str "Count: " @count)])))

(defn increment-count-button
  []
  [:button.button-primary
   {:on-click #(re-frame/dispatch [:increment-count])}
   "Inc"])

(defn decrement-count-button
  []
  [:button.button-primary
   {:on-click #(re-frame/dispatch [:decrement-count])}
   "Dec"])

(defn main-panel []
  [:div.section
   [:div.container
    [count-display]
    [decrement-count-button]
    [increment-count-button]]])
