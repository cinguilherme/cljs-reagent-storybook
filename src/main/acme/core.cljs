(ns acme.core
  (:require [reagent.dom :refer [render]]
            [acme.components.header :refer [header]]))

(defn init []
  (render [header "Hello, World!"]
          (js/document.getElementById "app")))