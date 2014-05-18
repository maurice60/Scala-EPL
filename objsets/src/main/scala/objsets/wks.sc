import objsets._
object wks {
  val set1 = new Empty
  val set2 = set1.incl(new Tweet("a", "a body", 20))
  val set3 = set2.incl(new Tweet("b", "b body", 20))
  val c = new Tweet("c", "c body", 7)

  val d = new Tweet("d", "d body", 9)

  val set4c = set3.incl(c)
  val set4d = set3.incl(d)
  val set5 = set4c.incl(d)
  println(set5.filter(t => t.user > "c"))

  println(set4d union set4c)

  val trends = set5.descendingByRetweet
  println(trends.head.user)




}