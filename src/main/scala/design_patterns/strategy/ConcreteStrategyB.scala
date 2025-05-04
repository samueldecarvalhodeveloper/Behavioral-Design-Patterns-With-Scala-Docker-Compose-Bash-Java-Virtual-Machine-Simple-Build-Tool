package design_patterns.strategy

class ConcreteStrategyB extends Strategy {
  override def doAlgorithm(data: List[String]): List[String] = data.reverse
}
