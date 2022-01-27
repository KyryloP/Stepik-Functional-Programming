import scala.annotation.tailrec

object TailFibonacciTask {
  def fibonacciImpl2(): Int => Int = {

    @tailrec
    def fibHelper(current: Int, previous: Int, step: Int): Int = {
      if (step == 0) current
      else fibHelper(current + previous, current, step-1 )
    }

    def fun: Int => Int = depth => {
            if (depth == 0) 0
            else fibHelper(current=1, previous=0, depth-1)
        }

        fun
    }
}