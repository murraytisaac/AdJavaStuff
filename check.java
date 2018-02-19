import java.util.*;
import java.io.*;
class check
{
 private static Stack<String> st=new Stack<String>();
 public static void main(String []args)throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String s=br.readLine();
     String result=check(s);
     System.out.println(result);
 }
 public static String check(String s)
 {
     int i=0;
     while(i<s.length())
     {
         if(s.charAt(i)==')'&&st.isEmpty())
          return "unsafe";
         else if(s.charAt(i)==')')
          st.pop();
         else if(s.charAt(i)=='(')
          st.push("safe");
         ++i;
         if (s.endsWith(";"))
         {
        	 return "unsafe";
         }
         if (s.contains("SELECT"+"WHERE")) {
        	 return "unsafe";
         }
        
     }
     if(st.isEmpty())
      return "safe";
     else return "unsafe";
 }
}