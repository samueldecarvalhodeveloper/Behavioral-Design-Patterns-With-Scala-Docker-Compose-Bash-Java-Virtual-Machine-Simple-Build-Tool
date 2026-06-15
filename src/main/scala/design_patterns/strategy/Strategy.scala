package design_patterns.strategy

trait Strategy {
  def doAlgorithm(data: List[String]): List[String]
}
