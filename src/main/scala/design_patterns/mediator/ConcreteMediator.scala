package design_patterns.mediator

class ConcreteMediator(private val component1: ComponentOne, private val component2: ComponentTwo) extends Mediator {
  component1.setMediator(this)
  component2.setMediator(this)

  override def notify(sender: Any, event: String): Unit = {
    event match {
      case "A" =>
        println("Mediator reacts on A and triggers following operations:")
        
        component2.doC()
      case "D" =>
        println("Mediator reacts on D and triggers following operations:")
        
        component1.doB()
        
        component2.doC()
      case _ =>
    }
  }
}
