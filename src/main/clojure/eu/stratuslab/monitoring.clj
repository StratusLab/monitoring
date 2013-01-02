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
(ns eu.stratuslab.monitoring
  (:require [metrics.gauges :refer [defgauge]]
            [eu.stratuslab.libvirt :as virt]))

(def libvirt-url "test:///default")

(defgauge num-active-domains
  (virt/num-active-domains libvirt-url))

(defgauge num-max-cpus
  (virt/num-max-cpus libvirt-url))

(defgauge num-active-cpus
  (virt/num-active-cpus libvirt-url))
