val strs: Seq[String] = Seq("1", "2", "4", "G5")
println(s"Elements of sequense = $strs")

val ints: Seq[Int] = strs.map(_ toInt)
println(s"Elements of ints = $ints")