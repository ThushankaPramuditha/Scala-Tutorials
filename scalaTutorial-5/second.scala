object second {
  def prime(num: Int, i: Int = 2): Unit = {
    if (num > 1) {
      if (num == 2) {
        println(num)
      }
      else if (num > i && num % i == 0) {

      }
      else if (num == i && num % i == 0) {
        println(num)
      }
      else {
        prime(num, i + 1)
      }
    }

  }

  def primeSeq(n:Int,x:Int=1): Unit = {
    if (n>=x) {
      prime(x)
      primeSeq(n,x+1)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter your number: ")
    val input = scala.io.StdIn.readInt()
    primeSeq(input)
  }
}