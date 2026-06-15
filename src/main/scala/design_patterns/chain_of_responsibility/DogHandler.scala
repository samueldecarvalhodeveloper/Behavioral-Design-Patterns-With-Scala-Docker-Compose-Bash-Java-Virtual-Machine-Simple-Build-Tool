package design_patterns.chain_of_responsibility

class DogHandler extends AbstractHandler {
  override def handle(request: String): Option[String] = {
    if (request == "MeatBall") {
      Some(s"Dog: I Will Eat The $request")
    } else {
      super.handle(request)
    }
  }
}
