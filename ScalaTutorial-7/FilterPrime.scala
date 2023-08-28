object FilterPrime {

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val outputList = filterPrime(inputList)
    println(outputList)
  }

  def isPrime(num: Int, x: Int = 2): Boolean = {
    if (num <= 1) false
    else if (x * x > num) true
    else if (num % x == 0) false
    else isPrime(num, x + 1)
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(numbers => isPrime(numbers))
  }

}
