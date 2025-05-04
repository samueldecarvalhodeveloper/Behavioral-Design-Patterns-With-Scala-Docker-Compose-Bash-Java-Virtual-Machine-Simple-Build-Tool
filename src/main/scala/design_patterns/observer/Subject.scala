package design_patterns.observer

trait Subject {
  def attach(observer: Observer): Unit
  def detach(observer: Observer): Unit
  def notifyObservers(): Unit
}
