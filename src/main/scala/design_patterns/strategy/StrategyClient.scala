package design_patterns.strategy

object StrategyClient {
  def execute(): Unit = {
    val context = new Context(new ConcreteStrategyA)
    
    println("Client: Strategy Is Set To Normal Sorting")
    
    context.doSomeBusinessLogic()

    println()

    println("Client: Strategy Is Set To Reverse Sorting")
    
    context.setStrategy(new ConcreteStrategyB)
    
    context.doSomeBusinessLogic()
  }
}

