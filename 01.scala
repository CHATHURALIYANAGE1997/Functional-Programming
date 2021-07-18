object Prime_Number extends App{

    def gcd(x:Int, y:Int):Int = y match{
        case 0 => x
        case y if(y>x) => gcd(y,x)
        case _ => gcd(y,x%y)
    }

    def Isprime(a:Int, n:Int=2):Boolean = n match{
        case x if(a==x) => true
        case x if(gcd(a,x)>1) => false
        case x => Isprime(a,x+1)
    }

    print(Isprime(7))
    
}