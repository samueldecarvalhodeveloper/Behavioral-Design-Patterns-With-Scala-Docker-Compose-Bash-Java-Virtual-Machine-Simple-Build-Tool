package design_patterns.state

class ConcreteStateA extends State {
  override def handleOne(): Unit = {
    context.transitionTo(new ConcreteStateB)

    println("ConcreteStateA Handles Request One")

    println("ConcreteStateA Wants To Change The State Of The Context")
  }

  override def handleTwo(): Unit = {
    println("ConcreteStateA Handles Request Two")
  }
}
