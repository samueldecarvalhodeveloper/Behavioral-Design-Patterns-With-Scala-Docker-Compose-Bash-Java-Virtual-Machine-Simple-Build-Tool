package design_patterns.state

class Context(private var state: State) {
  transitionTo(state)

  def transitionTo(state: State): Unit = {
    this.state = state

    this.state.setContext(this)

    println(s"Context: Transition To ${state.getClass.getSimpleName}")
  }

  def requestOne(): Unit = {
    state.handleOne()
  }

  def requestTwo(): Unit = {
    state.handleTwo()
  }
}
