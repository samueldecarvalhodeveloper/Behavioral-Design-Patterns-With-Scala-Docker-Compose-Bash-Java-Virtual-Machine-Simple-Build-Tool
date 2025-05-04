package design_patterns.command

class Receiver {
  def doSomething(a: String): Unit = {
    println(s"Receiver: Working On ($a)")
  }

  def doSomethingElse(b: String): Unit = {
    println(s"Receiver: Also Working On ($b)")
  }
}
