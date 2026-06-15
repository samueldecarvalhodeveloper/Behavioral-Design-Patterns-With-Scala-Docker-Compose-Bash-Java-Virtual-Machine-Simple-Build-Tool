package design_patterns.chain_of_responsibility

class SquirrelHandler extends AbstractHandler {
  override def handle(request: String): Option[String] = {
    if (request == "Nut") {
      Some(s"Squirrel: I Will Eat The $request")
    } else {
      super.handle(request)
    }
  }
}
