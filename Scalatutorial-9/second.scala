class RationalTwo(n: Int, d: Int) {
  require(d != 0, "Denominator must be nonzero")
  val numer: Int = n
  val denom: Int = d
  def -(other: RationalTwo): RationalTwo =
    new RationalTwo(numer * other.denom - other.numer * denom, denom * other.denom)
  override def toString: String = s"$numer/$denom"
}
object Two extends App {
  val x = new RationalTwo(3, 4)
  val y = new RationalTwo(5, 8)
  val z = new RationalTwo(2, 7)
  val result = x - y - z
  println(s"x: $x")
  println(s"y: $y")
  println(s"z: $z")
  println(s"Result of x - y - z: $result")
}
