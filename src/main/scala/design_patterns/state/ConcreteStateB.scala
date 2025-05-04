package design_patterns.state

class ConcreteStateB extends State {
  override def handleOne(): Unit = {
    println("ConcreteStateB Handles Request One")
  }

  override def handleTwo(): Unit = {
    context.transitionTo(new ConcreteStateA)

    println("ConcreteStateB Handles Request Two")

    println("ConcreteStateB Wants To Change The State Of The Context")
  }
}
