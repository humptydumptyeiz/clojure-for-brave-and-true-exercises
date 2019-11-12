(ns clojure-exercises.core
  (:gen-class))


(defn my-comp
      ([dummy dummy2 & foos]
        (let [rev-foos (reverse foos)]
          (fn [& args]
            (my-comp (apply (first rev-foos) args) (rest rev-foos)))))
      ([res remaining-foos]
       (if (empty? remaining-foos)
         res
         (recur ((first remaining-foos) res) (rest remaining-foos)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
      (let [ combined (my-comp :dummy1 :dummy2 dec inc *)]
                   (let [ans (combined 2 3)]
                     (println ans))))


