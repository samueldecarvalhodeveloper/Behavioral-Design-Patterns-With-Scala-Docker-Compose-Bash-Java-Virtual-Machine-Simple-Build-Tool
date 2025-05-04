package design_patterns.mediator

object MediatorClient {
  def execute(): Unit = {
    val componentOne = new ComponentOne()
    val componentTwo = new ComponentTwo()
    val mediator = new ConcreteMediator(componentOne, componentTwo)

    println("Client triggers operation A")
    
    componentOne.doA()

    println()
    
    println("Client triggers operation D")
    
    componentTwo.doD()
  }
}

