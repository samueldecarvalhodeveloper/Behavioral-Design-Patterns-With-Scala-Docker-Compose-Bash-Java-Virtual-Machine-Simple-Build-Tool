package design_patterns.command

class Invoker {
  private var onStart: Option[Command] = None
  private var onFinish: Option[Command] = None

  def setOnStart(command: Command): Unit = onStart = Some(command)

  def setOnFinish(command: Command): Unit = onFinish = Some(command)

  def doSomethingImportant(): Unit = {
    println("Invoker: Does Anybody Want Something Done Before I Begin?")

    onStart.foreach(_.execute())

    println("Invoker: ...Doing Something Really Important...")

    println("Invoker: Does Anybody Want Something Done After I Finish?")

    onFinish.foreach(_.execute())
  }
}
