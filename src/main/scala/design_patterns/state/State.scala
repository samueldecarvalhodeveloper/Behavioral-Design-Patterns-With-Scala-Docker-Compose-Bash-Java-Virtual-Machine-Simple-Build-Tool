package design_patterns.state

trait State {
  protected var context: Context = _

  def setContext(context: Context): Unit = {
    this.context = context
  }

  def handleOne(): Unit

  def handleTwo(): Unit
}
