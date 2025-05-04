package design_patterns.chain_of_responsibility

object Context {
  def execute(handler: Handler[String, String]): Unit = {
    val foods = List("Nut", "Banana", "Cup Of Coffee")

    for (food <- foods) {
      println(s"Client: Who Wants A $food?")

      handler.handle(food) match {
        case Some(result) => println(s"  $result")
        
        case None => println(s"  $food Was Left Untouched")
      }
    }
  }
}
