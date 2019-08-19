(ns roman-numerals.core_spec
  (:require [speclj.core :refer :all]
            [roman-numerals.core :refer :all]))

(describe "roman numberals converter"
          (it "converts arabic numbers to their roman representation"
              (should= "I" (to-roman 1))
              (should= "II" (to-roman 2))
              (should= "III" (to-roman 3))
              (should= "IV" (to-roman 4))
              (should= "V" (to-roman 5))
              (should= "IX" (to-roman 9))
              (should= "X" (to-roman 10))
              (should= "XVII" (to-roman 17))
              (should= "XIX" (to-roman 19))
              ))

(run-specs)