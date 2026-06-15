package design_patterns.interpreter

object InterpreterClient {
  def execute(): Unit = {
    val isMale = ExpressionManager.getMaleExpression
    val isMarriedWoman = ExpressionManager.getMarriedWomanExpression

    println("John Is Male? " + isMale.interpret("John"))
    println("Julie Is A Married Woman? " + isMarriedWoman.interpret("Married Julie"))
    println("Doe Is Male? " + isMale.interpret("Doe"))
    println("Alice Is Male? " + isMale.interpret("Alice"))
    println("Julie Is A Married Woman? " + isMarriedWoman.interpret("Julie"))
  }
}

