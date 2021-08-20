import scala.collection.mutable

// Das folgende Set ist immutable
var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet)
println(jetSet.contains("Cessna"))

// Jetzt ein mutable set
val movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)


// Maps (Key, Value. Dictionary in Python)
val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println("----- Was ist das für eine Map? -----")
println(treasureMap)
println(treasureMap(2))
println(treasureMap.size)
println("----- Alle Elemente der Map anzeigen -----")
for (i <- 1 to 3)
    println(treasureMap(i))

// Ist das Folgende auch dann eine immutable map, wenn oben die mutable-class importiert wird?
println("----- Eine neue Map -----")
val romanNumeral = Map(
    1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
)
println(romanNumeral)
