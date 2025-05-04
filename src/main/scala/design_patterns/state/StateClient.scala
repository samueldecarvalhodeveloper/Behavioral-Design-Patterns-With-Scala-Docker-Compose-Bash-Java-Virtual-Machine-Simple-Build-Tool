package design_patterns.state

object StateClient {
  def execute(): Unit = {
    val context = new Context(new ConcreteStateA)
    
    context.requestOne()
    
    context.requestTwo()
  }
}

