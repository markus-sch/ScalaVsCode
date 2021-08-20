val greetStrings = new Array[String](3)


greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

// Man kann das auch kürzer machen
val greetStrings3 = Array("Hello", ", ", "world ","greetStrings3")
println(greetStrings3)  // gibt den Typ an
for (i <- 0 to 3)
    print(greetStrings3(i))

println()
for (i <- 0 to 2)
    print(greetStrings(i))
    
// Oder auch so...
val greetStrings2: Array[String] = new Array[String](3)

// println 10 funktioniert nicht, Console println 10 schon, weil explizit immer der "Receiver of the method call" angegeben werden muss
Console println 10


val x = 1. + (2)
println(x)

println(1. + (2))

// Listen
val oneTwoThree = List(1, 2, 3)
println(oneTwoThree)

// Auch eine Liste
val fourFiveSix = 4 :: 5 :: 6 :: Nil
println(fourFiveSix)

val leereListe = Nil
println("Dies ist eine leere Liste: " + leereListe)

val leereListe2 = List()
println("Auch dies ist eine leere Liste: " + leereListe2)

// Funktioniert eine Liste auch mit gemischten Typen?
val gemischteListe = List(1, 2, "Dies ist ein String")
println("Listen mit unterschiedlichen Typen funktionieren auch: " + gemischteListe)


// List methods
val thrill = "Will" :: "fill" :: "until" :: Nil
println(thrill)
// Wieviel Listenelemente haben 4 Zeichen?
println("Wieviel Listenelemente haben 4 Zeichen? : " + thrill.count(s => s.length == 4))

println("Welches Element aus thrill steht an Stelle 2? : " + thrill(1))

// Löscht drop aus der Liste oder bezieht es sich nur auf die Anzeige? Es bezieht sich nur auf die Anzeige (Listen sind immutable!?)
println(thrill.drop(2))
println(thrill)

// Man kann auch die beiden rechten Elemente aus einer Liste aus der Anzeige entfernen
println(thrill.dropRight(2))

// Ist ein Element in einer Liste enthalten?
println(thrill.exists(s => s == "until"))

// Alle Listenelemente mit der Länge 4 ausgeben
println(thrill.filter(s => s.length == 4))

// Für alle Elemente der Liste etwas ausgeben
thrill.foreach(i => println("Ein Element ist: " + i))
println()

// Das geht auch kürzer (more concise), aber nur, wenn nicht noch ein String mit angezeigt werden soll
thrill.foreach(println)
println()

// Oder einfach die Elemente aneinander hängen und ein Leerzeichen dazwischen setzen
thrill.foreach(i => print(i + " "))
println() // Für die Leerzeile danach

// Was passiert, wenn man das Ganze mit forall macht? Type mismatch, weil Boolean erwartet wird.
// thrill.forall(s => print(s + " "))

println("Ist die Liste leer?: " + thrill.isEmpty)

// Es ist auch möglich, mit einer kurzen Variante der Ausgabe der Liste etwas hinzuzufügen.
// Das erscheint aber nur zwischen den Elementen, also nicht mehr nach dem letzten Element
println(thrill.mkString(" Hallo Markus "))

// Die Inhalte der Liste in umgekehrter Reihenfolge ausgeben
println(thrill.reverse)

// Nur das erste Element und alle Elemente außer dem ersten.
println(thrill.head)
println(thrill.tail)

// Sortierung: aufsteigend nach Kleinbuchstaben
println(thrill.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLower))
