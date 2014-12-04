import Data.Char (digitToInt)

main :: IO ()
main = print $ product $ [digitToInt $ digits !! (10^i-1) | i <- [0..6]]

digits = concat $ fmap show [1..]