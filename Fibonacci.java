public class Fibonacci {

public void fibonacci(){
    int sum ;
    int num1 = 0,num2 = 1;


    for(int i =0;i<15;i++){

     System.out.print(num1+" ");
     sum = num1 + num2;
     num1=num2;
     num2=sum;
    }
  // 0
}

public static void main(String args[]){

    Fibonacci obj = new Fibonacci();
    obj.fibonacci();

    }
}

