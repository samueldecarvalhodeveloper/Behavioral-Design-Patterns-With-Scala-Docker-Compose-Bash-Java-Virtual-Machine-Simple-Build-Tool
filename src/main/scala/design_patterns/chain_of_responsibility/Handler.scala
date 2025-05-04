package design_patterns.chain_of_responsibility

trait Handler[Request, Result] {
  def setNext(handler: Handler[Request, Result]): Handler[Request, Result]

  def handle(request: Request): Option[Result]
}
