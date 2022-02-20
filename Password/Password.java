//Solution by technoname.com

import java.util.Scanner;

public class Password
{
    /*static String Result(String s)
    {
        String alphabets="",specialCharacter="";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='A'&& s.charAt(i)<='Z') || (s.charAt(i)>='a'&& s.charAt(i)<='z'))
            {
            	alphsabets+=s.charAt(i);
            }
            else if(!(s.charAt(i)>='0'&& s.charAt(i)<='9'))
            {
            	specialCharacter+=s.charAt(i);
            }
        }
        return alphabets+specialCharacter;
    }*/
 public static void main(String[] args) 
 {
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  //String s=sc.nextLine();
  String alpha="";String spcl="";String str="";
   for(int i=0;i<s.length();i++)
   {
    if((s.charAt(i)>='A'&& s.charAt(i)<='Z') || (s.charAt(i)>='a'&& s.charAt(i)<='z'))
    alpha=alpha+s.charAt(i);
    else if(!(s.charAt(i)>='0'&& s.charAt(i)<='9'))
    
        spcl+=s.charAt(i);

        str=alpha+spcl;
    }
        System.out.println(str);

    
}
}