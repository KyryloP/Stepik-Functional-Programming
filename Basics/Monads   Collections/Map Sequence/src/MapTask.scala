object MapTask {
  def mapping(input: Seq[String]): Seq[Int] = {

    def mapfn(s: String): Option[Int] = {
      try {
        Some(s.toInt)
      } catch {
        case e: Exception => None
      }
    }

    input.map(mapfn).flatten
  }
}