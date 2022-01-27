import scala.annotation.tailrec

object TakeWordsTask {
  val lineSeparatorString = "\n"

  def takeWords(seq: Seq[String]): Seq[String] = {

    @tailrec
    def Helper(lst: List[String], element: String): List[String] = element match {
      case "\n" => lst :+ lineSeparatorString
      case a if a.contains(lineSeparatorString) =>
        val pair = a.splitAt(a.indexOf(lineSeparatorString))
        Helper(lst :+ pair._1 :+ lineSeparatorString, pair._2.slice(1, pair._2.length))
      case a => lst :+ a
    }

    seq
      .flatMap(Helper(Nil, _))
      .takeWhile(w => !w.contains(lineSeparatorString))

  }

}
