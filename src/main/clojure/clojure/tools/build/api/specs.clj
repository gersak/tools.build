(ns clojure.tools.build.api.specs
  (:require [clojure.spec.alpha :as s]))


(defn file? [x] (instance? java.net.URL x))
(defn url? [x] (instance? java.net.URL x))

(s/def ::lib qualified-ident?)
(s/def ::path (s/or
                ::string string? 
                ::url url?
                ::file file?))
(s/def ::paths (s/coll-of
                 (s/or
                   ::string string? 
                   ::url url?
                   ::file file?)))