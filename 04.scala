object Even_Or_Odd extends App{

    def Even(x:Int):Boolean = x match{
        case 0 => true
        case _ => Odd(x-1)
    }

    def Odd(x:Int):Boolean = !Even(x)

    println(Even(10))
    println(Odd(5))
    println(Odd(4))

}