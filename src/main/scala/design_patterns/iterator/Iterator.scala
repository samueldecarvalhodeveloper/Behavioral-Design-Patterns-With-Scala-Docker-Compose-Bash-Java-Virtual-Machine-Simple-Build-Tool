package design_patterns.iterator

trait Iterator[T] {
  def current(): T

  def next(): T

  def key(): Int

  def valid(): Boolean

  def rewind(): Unit
}
