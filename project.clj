(defproject bionitio "0.1.0"
  :description "An example bioinformatics tool to demonstrate good programming practices"
  :url "https://github.com/bionitio-team/bionitio"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [clj-biosequence "0.5.2"]
                 [org.clojure/tools.cli "1.0.206"]
                 [com.taoensso/timbre "5.1.2"]]
  :main ^:skip-aot bionitio.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :plugins [[lein-cljfmt "0.5.6"] [lein-bin "0.3.5"]]
  :bin {:name "bionitio" :bin-path "."})
