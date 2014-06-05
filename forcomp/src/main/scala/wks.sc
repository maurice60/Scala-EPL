import forcomp.Anagrams._
//println(dictionary.length)
//val mapX = "ABaC".toList.groupBy(c => c.toLower).map{case (k,l) => (k, l.length)}.toList
//val s = List("This", "is",  "a", "sentence")
//val sJ = wordOccurrences(s.mkString)
//val wa = wordAnagrams("player")
//combinations(List(('a', 2), ('b', 2)))
//def subtract(x: Occurrences, y: Occurrences): Occurrences = {
//  for (el <- x) yield {
//    val yf = y filter (el._1 == _._1)
//    yf match {
//      case Nil => el
//      case h :: t => (el._1, el._2 - h._2)
//    }
//  }
//} filter (_._2 > 0)

subtract(wordOccurrences("this"), wordOccurrences("i"))

sentenceAnagrams(List("This", "ha"))