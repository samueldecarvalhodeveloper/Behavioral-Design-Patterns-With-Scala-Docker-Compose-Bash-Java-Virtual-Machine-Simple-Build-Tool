package design_patterns.iterator

trait Aggregator[T] {
  def getIterator: Iterator[T]
}
