
object sixth {
  def fibonacci(num:Int):Int={
    if (num<=0){
      0
    }
    else if (num==1){
      1
    }
    else{
      fibonacci(num-1)+fibonacci(num-2)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter your number: ")
    val in = scala.io.StdIn.readInt()
    for (i <- 0 to in) {
      println(fibonacci(i))
    }
  }
}
