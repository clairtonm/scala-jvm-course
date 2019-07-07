
object ScalaExercises extends App {

  def greetingFunction(name: String, age: Int) = s"Hi, my name is $name and I am $age years old"

  def factorialFunc(n: Int): Int = {
    def auxFactorial(auxN: Int, acc: Int): Int = {
      if (auxN == 0) acc else auxFactorial(auxN -1, acc * auxN)
    }

    if (n == 0) 0 else auxFactorial(n, 1)
  }

  def fibonacciFunc(n: Int): Int = {
    if(n == 0 || n == 1) n else fibonacciFunc(n - 1) + fibonacciFunc(n - 2)
  }

  println(greetingFunction("Clairton", 27))

  println("Factorial: " + factorialFunc(5))

  println("Fibonacci: " + fibonacciFunc(10))

}
