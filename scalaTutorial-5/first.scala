object first {
  def prime(num:Int,i:Int=2):Boolean={
    if (num>1){
      if (num==2){
        true
      }
      else if (num>i && num%i==0){
        false
      }
      else if (num==i && num%i==0){
        true
      }
      else{
        prime(num, i+1)
      }
    }
    else {
      return false
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter your number: ")
    val in= scala.io.StdIn.readInt()
    println(prime(in))
  }

}