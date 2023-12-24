public class prime_number{
   public static void main(String args[]){
   int m=0,flag=0;
   int n=1;//it is the number to be checked
   m=n/2;
   if( n==0 || n==3 ){
   System.out.println("is not prime number"+n);
   }

   else{
   for(int i=2;i<=m;i++){
   if(n%i==0){
   System.out.println("is not a prime number"+n);
   flag=1;
   break;
   }
   }
   if(flag==0){
   System.out.println("is prime number");
   }
    //end of else

   }

   



   
   

   }
   }
   

