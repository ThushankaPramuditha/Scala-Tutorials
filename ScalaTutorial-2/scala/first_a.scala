import scala.collection.generic.BitOperations

object FirstA {
  def main(args: Array[String]): Unit = {
    var i, j,k :Int =2
    var  m, n : Int = 5
    var f, g: Float = 12.0f
    var g:Float =4.0f
    var c: Char = 'X'



    val expressionA = k + 12 * m
    val expressionB = m / j
    val expressionC = n % j
    val expressionD = m / j * j
    val expressionE = f + 10 * 5 + g

    i += 1
    val expressionF = i * n

    println(s"a) $expressionA")
    println(s"b) $expressionB")
    println(s"c) $expressionC")
    println(s"d) $expressionD")
    println(s"e) $expressionE")
    println(s"f) $expressionF")
  }
}
