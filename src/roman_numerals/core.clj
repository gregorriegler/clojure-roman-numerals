(ns roman-numerals.core)

(def dictionary [[10, "X"],
                 [9, "IX"],
                 [5, "V"],
                 [4, "IV"],
                 [1, "I"]])

(defn to-roman [arabic-number]
  (loop [number arabic-number result "" dictionary-entry dictionary]
    (if (<= number 0) result
                      (let [[arabic roman] (first dictionary-entry)]
                        (if (>= number arabic)
                          (recur (- number arabic) (str result roman) dictionary-entry)
                          (recur number result (rest dictionary-entry)))))))

