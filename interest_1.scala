package practicle09

object interest_1 {
  def main(args: Array[String]): Unit = {
    def interestRate(deposit: Double): Double = {
      if (deposit <= 20000) 0.02
      else if (deposit <= 200000) 0.04
      else if (deposit <= 2000000) 0.035
      else 0.065
    }

    println("Enter deposit amount:")
    val deposit = scala.io.StdIn.readDouble()
    val interest = deposit * interestRate(deposit)
    println(f"Interest earned: Rs. $interest%.2f")
  }
}
