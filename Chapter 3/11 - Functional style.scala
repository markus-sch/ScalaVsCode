def printArgs(args: Array[String]): Unit = {
    args.foreach(println)
}

println("Ausgabe der printArgs-Methode")
println("-----------------------------")
println(printArgs(args))


// Oder kürzer
def formatArgs(args: Array[String]) = args.mkString("\n")

println("Ausgabe der formatArgs-Methode")
println("------------------------------")

println(formatArgs(args))
