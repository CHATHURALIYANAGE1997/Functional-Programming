object AddEven extends App{
    
    def Even(x:Int):Boolean = {
        if(x%2==0) true else false
    }

    def total(x:Int):Int = x match {
        case 2 => x
        case y if(Even(x)) =>  x+total(x-1)
        case _ => total(x-1)
    }

    print(total(10))

}