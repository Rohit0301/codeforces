import java.util.*;
public class String_task{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();  
        String output="";
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a!='a' && a!='e' && a!='i' && a!='o' && a!='u' && a!='y'){
                output=output+"."+a;
            }
 }
             System.out.println(output);
        
    }
}