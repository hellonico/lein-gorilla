(defproject hellonico/lein-gorilla "0.4.3-SNAPSHOT"
  :description "A Leiningen plugin for the Gorilla REPL."
  :url "https://github.com/JonyEpsilon/lein-gorilla"
  :license {:name "MIT"}
  :dependencies [[hellonico/gorilla-repl "0.4.1"]]
  :repositories [
    ["vendredi" {:url "https://repository.hellonico.info/repository/hellonico/" :creds :gpg}]
  ]
  :release-tasks [["vcs" "assert-committed"]
                ["change" "version" "leiningen.release/bump-version" "release"]
                ["vcs" "commit"]
                ["vcs" "tag" "--no-sign"]
                ["deploy" "vendredi"]
                ["change" "version" "leiningen.release/bump-version"]
                ["vcs" "commit"]
                ["vcs" "push"]
                ]
  :eval-in-leiningen true)
