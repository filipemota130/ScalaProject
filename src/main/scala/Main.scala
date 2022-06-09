import calculator._
object Main extends App {
  val calculadora = new Calculadora
  println(calculadora.sum(2, 2))
  println(calculadora.divide(2, 0))
  println(calculadora.checkPar(2))
  val lista = List(1, 2, 3)
  val nome = "Pessoa"
  println(s"teste de print de variavel: Olá, $nome")
  println(lista)
  println(lista.filter(x => calculadora.checkPar(x)))
  println("Hello, World!")
}
