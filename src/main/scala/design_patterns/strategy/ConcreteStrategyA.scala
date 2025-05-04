package design_patterns.strategy

class ConcreteStrategyA extends Strategy {
  override def doAlgorithm(data: List[String]): List[String] = data.sorted
}
