object FizzBuzzTask {
  def fizzBuzzIt(s: Seq[Int]): Seq[String] = {

    def fzb(i: Int) = i match {
      case x if (x % 3 == 0) && (x % 5 ==0 ) => "FizzBuzz"
      case x if x % 3 == 0 => "Fizz"
      case x if x % 5 == 0 => "Buzz"
      case x => x.toString
    }

    s.map(fzb)

  }
}