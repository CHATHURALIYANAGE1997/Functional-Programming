object Addition extends App{

    def total(x:Int):Int = {
        if(x==1) {
            1
        }
        else{
            x+total(x-1)
        }

    }

    print(total(5))

}