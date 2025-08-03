fun main(){
    var above70 = false;
    var knowprogrammin = false;

    var calledinterviewd = above70 && knowprogrammin  // all condition are satisfied  in And operator &&
    println(calledinterviewd)


    // or

     above70 = false;
     knowprogrammin = true;

    calledinterviewd = above70 ||knowprogrammin   // any one conditions are starisfied i or operator ||
    println(calledinterviewd)


    if(calledinterviewd){
        println("Yes Interviewed called ")
    }else{
        println("Not Interviewed called ")
    }

    // not !=
    above70 = false;
    knowprogrammin = true;

    calledinterviewd = above70 ||knowprogrammin
    println(calledinterviewd)


    if(calledinterviewd){
        println("Yes Interviewed called ")
    }else{
        println("Not Interviewed called ")
    }

    var answer = false;
    var results = !answer
    println("Ans is "+results)

}