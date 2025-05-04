package design_patterns.template_method

object Context {
  def execute(abstractClass: AbstractClass): Unit = {
    abstractClass.templateMethod()
  }
}
