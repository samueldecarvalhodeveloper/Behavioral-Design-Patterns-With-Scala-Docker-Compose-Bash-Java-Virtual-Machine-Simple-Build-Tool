package design_patterns.command

class SimpleCommand(private val payload: String) extends Command {
  override def execute(): Unit = {
    println(s"SimpleCommand: See, I Can Do Simple Things Like Printing ($payload)")
  }
}
