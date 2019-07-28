
object Recursion extends App {

  def concatFunction(n: Int, string: String): String = {
    def auxFunction(nAux: Int, acc: String): String = {
      if (nAux == 1) acc
      else auxFunction(nAux - 1, acc + string)
    }
    auxFunction(n, string)
}

  println(concatFunction(10, "test1"))

  def isPrime(n: Int): Boolean = {
    def auxFunction(nAux: Int, stillPrime: Boolean): Boolean = {
      if (!stillPrime) false
      else if (nAux <= 1) true
      else auxFunction(nAux - 1, n % nAux != 0 && stillPrime)
    }
    auxFunction(n-1, true)
  }

  println(isPrime(3))
  println(isPrime(37))
  println(isPrime(200))

  def fibonacci(n: Int): Int = {
    def auxFunction(nAux: Int, last: Int, nextToLast: Int): Int = {
      if (nAux >= n) last
      else auxFunction(nAux + 1, last + nextToLast, last)
    }
    if (n <= 2 ) 1
    else auxFunction(2, 1, 1)
  }
  println(fibonacci(5))
  println(fibonacci(7))
  println(fibonacci(8))

}