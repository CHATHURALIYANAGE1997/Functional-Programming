object Fibonacci extends App{

    def fibonacci(x:Int):Any = {
        if(x>0) fibonacci(x-1)
        print(fs(x)+ " ")
    }

    def fs(x:Int):Int =x match{
        case x if(x==0) => 0
        case x if(x==1) => 1
        case x => fs(x-1)+fs(x-2)
    }

    fibonacci(10)

}