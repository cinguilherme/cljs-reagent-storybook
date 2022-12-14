(ns acme.stories.header-stories
  (:require [acme.components.header :refer [header]]
            [reagent.core :as r]))

(def ^:export default #js {:title "Header Component"
                           :component (r/reactify-component header)})

(defn ^:export helloWorldHeader []
  (r/as-element [header "Hello, World!"]))