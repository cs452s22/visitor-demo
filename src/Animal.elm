module Animal exposing (Animal(..), ride)


type Animal
    = Cow String -- name
    | Snake String Float -- species and slitheriness
    | Fish Bool -- True if salt water


ride : Animal -> String
ride a =
    case a of
        Cow n ->
            "You are riding " ++ n

        Snake "Python" slither ->
            if slither < 0.5 then
                "You are riding a Python"

            else
                "You slipped off!"

        Snake species _ ->
            "You can't ride a " ++ species

        Fish True ->
            "You can't ride a sea fish."

        Fish False ->
            "You can't ride a freshwater fish."
