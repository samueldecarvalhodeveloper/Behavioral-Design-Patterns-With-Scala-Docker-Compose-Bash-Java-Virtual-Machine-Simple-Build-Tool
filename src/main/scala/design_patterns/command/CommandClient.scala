package design_patterns.command

object CommandClient {
  def execute(): Unit = {
    val invoker = new Invoker
    val receiver = new Receiver
    
    invoker.setOnStart(new SimpleCommand("Say Hi!"))

    invoker.setOnFinish(new ComplexCommand(receiver, "Send Email", "Save Report"))

    invoker.doSomethingImportant()
  }
}
