
import java.util.*;
import java.lang.*;
public class CorrectIncorrect 
{
    public static void main(String[]args)
    {int c=0;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int diffofLastFirst=Character.getNumericValue(str.charAt(str.length()-1))-Character.getNumericValue(str.charAt(0));
        //System.out.println(diffofLastFirst);
        if(diffofLastFirst==1||diffofLastFirst==-1)
         c=1;
           for(int i=0;i<str.length()-1;i++)
          {
            char ch=str.charAt(i);//System.out.println(ch);
            char ch1=str.charAt(i+1);
            int diff=Character.getNumericValue(ch)-Character.getNumericValue(ch1);
           // System.out.println(diff);
            if(diff==1||diff==-1)
            {
                c++;
            }

           }
    
        if(c==str.length())
        System.out.println("correct");
        else
        System.out.println("incorrect");
    }  

}

