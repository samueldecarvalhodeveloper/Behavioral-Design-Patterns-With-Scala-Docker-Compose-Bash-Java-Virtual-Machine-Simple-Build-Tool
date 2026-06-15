package design_patterns.observer

trait Observer {
  def update(subject: Subject): Unit
}
