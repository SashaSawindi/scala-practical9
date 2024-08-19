object p91 {

  def main(args: Array[String]): Unit = {
    println("Enter the deposit amount:")
    val deposit = scala.io.StdIn.readLine().toDouble

    val calculateInterest: Double => Double = {
      case amount if amount <= 20000    => amount * 0.02
      case amount if amount <= 200000   => amount * 0.04
      case amount if amount <= 2000000  => amount * 0.035
      case amount if amount > 2000000   => amount * 0.065
    }

    val interest = calculateInterest(deposit)
    println(s"The interest for a deposit of Rs. $deposit is Rs. $interest")
  }
}
