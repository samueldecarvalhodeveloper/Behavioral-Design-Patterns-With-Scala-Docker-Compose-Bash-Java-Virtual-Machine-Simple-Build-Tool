package design_patterns.chain_of_responsibility

class MonkeyHandler extends AbstractHandler {
  override def handle(request: String): Option[String] = {
    if (request == "Banana") {
      Some(s"Monkey: I Will Eat The $request")
    } else {
      super.handle(request)
    }
  }
}
