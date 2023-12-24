# simple-program
class fibonacci_series{
  public static void main(String args[]){
     int n1=0;
     int n2=1;
     System.out.println(n1);
     System.out.println(n2);
     for(int i=1;i<=5;i++){
     int fib=n1+n2;
     System.out.println(fib);
     n1=n2;
     n2=fib;
     fib=n1;

     }



   }


}
