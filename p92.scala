object p92 {

  def main(args: Array[String]): Unit = {
    println("Enter an integer:")
    val input = scala.io.StdIn.readLine().toInt

    val isEven: Int => Boolean = _ % 2 == 0

    val categorizeNumber: Int => String = {
      case n if n <= 0 => "Negative/Zero is input"
      case n if isEven(n) => "Even number is given"
      case _ => "Odd number is given"
    }

    println(categorizeNumber(input))
  }
}
