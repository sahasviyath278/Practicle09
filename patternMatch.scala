package practicle09

object patternMatch {
  def main(args: Array[String]): Unit = {
    print("Enter an integer: ")
    val input = scala.io.StdIn.readInt()

    val category = input match {
      case x if x < 0 => "Negative"
      case 0 => "Zero"
      case x if x % 2 == 0 => "Even"
      case _ => "Odd"
    }

    println(category)
  }
}
