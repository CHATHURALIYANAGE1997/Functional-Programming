package Test

object test {

  def main(args: Array[String]): Unit ={
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    //Encrypt
    val E = (c:Char, key:Int, s:String) =>s((s.indexOf(c.toUpper)+key)%s.size)
    println(E('h', 3, alphabet))
    //Decrypt
    val D = (c:Char, key:Int, s:String) => s((s.indexOf(c.toUpper)-key)%s.size)
    println(D('z', 3, alphabet))


    //(12)->Caesar Cipher
    val cipher = (algo:(Char, Int, String)=>Char, s:String, key:Int,  a:String)=>s.map(algo(_, key, a))

    val ct = cipher(E, "helloz", 5, alphabet)
   // val pt = cipher(D, ct, 5, alphabet)

    println(ct)
    //println(pt)
  }
}