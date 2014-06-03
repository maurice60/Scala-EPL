import forcomp.Anagrams._

println(dictionary.length)

val mapX = "ABaC".toList.groupBy(c => c.toLower).map{case (k,l) => (k, l.length)}.toList

val s = List("This", "is",  "a", "sentence")

val sJ = wordOccurrences(s.mkString)

val sX = s flatMap {w => wordOccurrences(w)}