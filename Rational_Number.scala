package test1

object test1 {

  class rational(n:Int, d:Int){

    //Requirement
    require(d>0, "d must be greater than 0")

    //numorator
    def numor = n/math.abs(gcd(n,d))

    //denominator
    def denom = d/math.abs(gcd(n,d))

    //contructor to single parameter object
    def this(n:Int) = this(n, 1)

    def gcd(a:Int, b:Int):Int = if(b == 0) a else gcd(b, a%b)

    def +(r:rational) = new rational((this.numor*r.denom) + (r.numor*this.denom), this.denom*r.denom)

    def neg = new rational(-numor, denom)

    def -(r:rational) = this + r.neg

    override def toString = numor+"/"+denom
  }

  def main(args: Array[String]): Unit = {

    var r1 = new rational(5,2)

    var x = new rational(3,4)
    var y = new rational(5,8)
    var z = new rational(2,7)

    var r2 = x-y-z

    println("negation of r1 = " + r1.neg)
    println("substrction of x, y, z = " + r2)



  }



}