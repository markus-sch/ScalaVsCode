import scala.io.Source

// if (args.length > 0) {
//     for (line <- Source.fromFile(args(0)).getLines())
//         println(line.length + " " + line)
// }
// else
//     Console.err.println("Please enter filename")


// Eine schönere Bildschirmausgabe

def widthOfLength(s: String) = s.length.toString.length

// Speichern der kompletten Datei in einer Variablen
// Dadurch ist allerdings die komplette Datei während der Verarbeiung im Arbeitsspeicher
println(args.length)
if (args.length > 0) {
    val lines = Source.fromFile(args(0)).getLines().toList
    val longestline = lines.reduceLeft(
        (a,b) => if (a.length > b.length) a else b
    )
}

// Erste Iteration über die komplette Datei, Ermitteln der maximalen Zeilenlänge

// Maximale Zeilenlänge in maxWidth speichern
val maxWidth = widthOfLength(longestline)

// Zweite Iteration über die komplette Datei, Anzeige auf dem Bildschirm
for (line <- lines) {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    println(padding + line.length + " | " + line)
}





