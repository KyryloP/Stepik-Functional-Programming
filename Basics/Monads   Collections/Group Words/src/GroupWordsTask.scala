object GroupWordsTask {
  def groupIt(wordsSeq: Seq[String]): Map[Char, Int] = {


wordsSeq
  .groupBy(_(0))
  .map(x => (x._1, x._2.flatten))
  .map(x => (x._1, x._2.count(_ == x._1)))
  }

}