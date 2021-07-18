object Prime_Seq extends App{

    def gcd(x:Int, y:Int):Int = y match{
        case 0 => x
        case y if(y>x) => gcd(y,x)
        case _ => gcd(y,x%y)
    }

    def Isprime(a:Int, b:Int=2):Boolean = b match{
        case x if(a==x) => true
        case x if(gcd(a,x)>1) => false
        case x => Isprime(a,x+1)
    }

    def IsprimeSeq(b:Int):Unit = {
        if(b>1){
            IsprimeSeq(b-1)
            if(Isprime(b)){
                print(b +" ")
            }
        }
    }

    IsprimeSeq(10)

}