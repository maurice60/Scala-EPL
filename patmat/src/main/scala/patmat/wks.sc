import patmat.Huffman._

val te = "huffman est cool".toList
val ti = times(te)
val ll = makeOrderedLeafList(ti)
val un = until(singleton, combine)(ll)
val enc = encode(createCodeTree(te))(te)
println(enc.length)  //58


val enc1 = quickEncode(createCodeTree(te))(te)
decode(createCodeTree(te), enc)
decode(createCodeTree(te), enc1).mkString
//val ll = makeOrderedLeafList(List(('a',8),('b',3),('c',1), ('d',1), ('e',1),('f',1), ('g',1), ('h',1)))
//until(singleton, combine)(ll)

