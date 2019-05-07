(ns starter.browser
  (:require [reagent.core :as r]
            ["react-flip-move" :as FlipMove]))

(defn flip-move-example [articles]
  [:> FlipMove
   (for [article articles]
     ^{:key (:id article)} [:div (:body article)])])

(defn app []
  (let [state (r/atom {:articles [{:id 0 :body "Article 1"}
                                  {:id 1 :body "Article 2"}
                                  {:id 2 :body "Article 3"}]})]
    (fn []
      [:div [:h1 "Hello, world!"]
       [:div [:button
              {:on-click #(swap! state update :articles reverse)}
              "reverse"]]
       [flip-move-example (:articles @state)]])))


(defn ^:dev/after-load start []
  (r/render [app] (.getElementById js/document "app")))

(defn ^:export init []
  (start))
