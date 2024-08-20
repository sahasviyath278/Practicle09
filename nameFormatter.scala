package practicle09

object nameFormatter {
  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    def formatName(name: String, formatter: String => String): String = formatter(name)

    println(formatName(names(0), _.toUpperCase))
    println(formatName(names(1), n => n.substring(0, 2).toUpperCase + n.substring(2).toLowerCase))
    println(formatName(names(2), _.toLowerCase))
    println(formatName(names(3), n => n.init + n.last.toUpper))
  }
}
