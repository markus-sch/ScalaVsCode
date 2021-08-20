/*
var i = 0
while (i < args.length) {
    println(args(i))
    i += 1
}
*/
args.foreach((arg: String) => println(arg))

// Leerzeile
println()

// Das geht auch kürzer

args.foreach(println)