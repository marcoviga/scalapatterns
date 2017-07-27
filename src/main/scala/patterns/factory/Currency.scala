package factory

trait Currency {
  def getConversionRateToPounds: String
}

object CurrencyConverter {

  private object EuroToPound extends Currency {
    override def getConversionRateToPounds = "0.8"
  }

  private object DollarToPound extends Currency {
    override def getConversionRateToPounds = "0.6"
  }

  private object NoIdeaMate extends Currency {
    override def getConversionRateToPounds = "No Idea Mate"
  }

  def apply(s: String): Currency = {
    if (s == "Dollar") DollarToPound
    else if ( s == "Euro") EuroToPound
    else NoIdeaMate
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val c = CurrencyConverter("Dollar")
    println(c.getConversionRateToPounds)
  }
}
