package design_patterns.strategy

class Context(private var strategy: Strategy) {
  def setStrategy(strategy: Strategy): Unit = {
    this.strategy = strategy
  }

  def doSomeBusinessLogic(): Unit = {
    val result = strategy.doAlgorithm(List("a", "b", "c", "d", "e"))

    println("Context: Sorting Data Using The Strategy (Not Sure How It Will Do It)")

    println(result.mkString(","))
  }
}