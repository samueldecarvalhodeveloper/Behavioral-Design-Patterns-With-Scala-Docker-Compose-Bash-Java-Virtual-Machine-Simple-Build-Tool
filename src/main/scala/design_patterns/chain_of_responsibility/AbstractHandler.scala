package design_patterns.chain_of_responsibility

abstract class AbstractHandler extends Handler[String, String] {
  private var nextHandler: Option[Handler[String, String]] = None

  override def setNext(handler: Handler[String, String]): Handler[String, String] = {
    nextHandler = Some(handler)
    
    handler
  }

  override def handle(request: String): Option[String] = {
    nextHandler.flatMap(_.handle(request))
  }
}
