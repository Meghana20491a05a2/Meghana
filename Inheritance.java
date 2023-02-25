import java.util.*;
class Inheritance
{
    public static  void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>arr = new ArrayList<Integer>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        } 
        C c1 = new C(arr,n);
        A b = new A();
        b.book(c1);
        

    }
}
class C 
 {
    int n;
    ArrayList<Integer> arr;
    C(ArrayList<Integer>arr,int n)
    {
        this.arr=arr;
        this.n=n;
    }
    
 }
 class A 
{
  void book(C c1)
  {
    int sum=0;
    int sum1=0;
    for(int i=0;i<c1.n;i++)
    {
      if(i%2==0)
      {
          sum = sum+c1.arr.get(i);
      } 
      else 
        {
          sum1 = sum1+c1.arr.get(i);
        }
    }    
    System.out.println(sum-sum1);
  }  
}  
  

  
