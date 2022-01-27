object ZipWordTask {
  def zipIt(prefixSeq: Seq[String], wordSeq: Seq[String], suffixSeq: Seq[String]): Seq[String] = {

    (prefixSeq, wordSeq, suffixSeq).zipped.toList.map(tuple => tuple.productIterator.mkString)
  }



}