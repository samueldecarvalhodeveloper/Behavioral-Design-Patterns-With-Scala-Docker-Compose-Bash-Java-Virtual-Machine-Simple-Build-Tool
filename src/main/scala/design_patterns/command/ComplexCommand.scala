package design_patterns.command

class ComplexCommand(private val receiver: Receiver, private val a: String, private val b: String) extends Command {
  override def execute(): Unit = {
    println("ComplexCommand: Complex Stuff Should Be Done By A Receiver Object")

    receiver.doSomething(a)

    receiver.doSomethingElse(b)
  }
}
