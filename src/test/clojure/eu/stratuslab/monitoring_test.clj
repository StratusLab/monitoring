;;
;; Copyright (c) 2010, Centre Nationale de la Recherche Scientifique
;;
;; Licensed under the Apache License, Version 2.0 (the "License");
;; you may not use this file except in compliance with the License.
;; You may obtain a copy of the License at
;;
;; http://www.apache.org/licenses/LICENSE-2.0
;;
;; Unless required by applicable law or agreed to in writing, software
;; distributed under the License is distributed on an "AS IS" BASIS,
;; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
;; See the License for the specific language governing permissions and
;; limitations under the License.
;;
(ns eu.stratuslab.monitoring-test
  (:require [metrics.gauges :as mc])
  (:use clojure.test
        eu.stratuslab.monitoring))

(deftest check-num-active-domains-gauge
  (let [v (mc/value num-active-domains)]
    (println "active domains gauge: " v)
    (is (= v 1))))

(deftest check-num-max-cpus-gauge
  (let [v (mc/value num-max-cpus)]
    (println "max cpus gauge: " v)
    (is (pos? v))))

(deftest check-num-active-cpus-gauge
  (let [v (mc/value num-active-cpus)]
    (println "active cpus gauge: " v)
    (is (pos? v))))
