package calculator

class Calculadora {
  def sum(x: Double, y: Double): Double = {
    println("teste")
    return x+y;
  }
  def sub(x: Double, y: Double): Double = x - y
  def multiply(x: Double, y: Double) = x * y
  def divide(x: Double, y: Double): AnyRef = try {
    (x/y).toString
  } catch {
    case e: Throwable => "Error"
  }
  def checkPar(x: Int): Boolean = x % 2 == 0
}
