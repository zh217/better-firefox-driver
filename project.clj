(defproject zh217/better-firefox-driver "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "Eclipse Public License"
                      :url  "http://www.eclipse.org/legal/epl-v10.html"}
            :java-source-paths ["src"]
            :dependencies [[org.seleniumhq.selenium/selenium-remote-driver "2.43.1"]]
            :profiles {:dev {:dependencies [[org.seleniumhq.selenium/selenium-server "2.43.1"]
                                            [org.seleniumhq.selenium/selenium-java "2.43.1"]
                                            [org.clojure/clojure "1.6.0"]]}})
