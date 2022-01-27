import scala.annotation.tailrec

object FactorialTask {

  def factorialImpl(): Int => Long = {
    fac
  }

  @tailrec
  def facHelp(n:Int, step:Long = 1):Long = {
    if (n < 1) step
    else facHelp (n-1, step*n)
  }

  def fac(n:Int):Long = {
    facHelp(n)
  }

}