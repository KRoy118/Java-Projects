import java.util.*;
//import java.math.*;
class Main
{//Spaces between outputs added for clarity.It wasn't asked in question
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int l=sc.nextInt();
        int ar[]=new int[100];
        int i,j=0,k=0;
        for(i=0;i<l;i++)
        ar[i]=sc.nextInt(); 
        System.out.println();
        int  n=sc.nextInt();int br[]=new int[100];int s1=0,s2=0;
       // int cr[]=new int[100];
        
        for(i=l-1;i>Math.abs((l-1)-n);i--)
       { s1=j;br[j]=ar[i];j++;}
       
       //for(i=0;i<n-1;i++)
      //{ s2=k;cr[k]=ar[i];k++;}
      System.out.println();
        for(i=j-1;i>=0;i--)
      System.out.println(br[i]);
      System.out.println();
      
      for(i=0;i<=Math.abs((l-1)-n);i++)
      System.out.println(ar[i]);
    
      
       
        
    }
}
