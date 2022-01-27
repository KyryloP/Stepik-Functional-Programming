object PurityTask {

  case class Integer(var value: Int) { }

  def isPure(incrementFn: Integer => Integer): Boolean = {

    val input = Integer(1)
    val res1 = incrementFn(input)
    val res2 = incrementFn(input)

    val d1 = incrementFn(input).value - input.value
    val d2 = incrementFn(incrementFn(input)).value - input.value


    if (res1 == res2 && d1 ==1 && d2 ==2 ) true else false
  }
}