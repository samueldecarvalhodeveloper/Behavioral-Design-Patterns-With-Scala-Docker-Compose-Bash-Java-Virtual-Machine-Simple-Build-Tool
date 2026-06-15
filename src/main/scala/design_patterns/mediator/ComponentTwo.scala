package design_patterns.mediator

class ComponentTwo extends BaseComponent {
  def doC(): Unit = {
    println("Component Two Does C")

    mediator.notify(this, "C")
  }

  def doD(): Unit = {
    println("Component Two Does D")

    mediator.notify(this, "D")
  }
}
