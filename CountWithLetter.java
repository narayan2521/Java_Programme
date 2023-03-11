import java.util.Scanner;
public class CountWithLetter {
     public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The String : ");
        String s1=scan.nextLine();
        String s="";
        while(s1.length()>0)
        {
            char ch=s1.charAt(0);
            String s2=s1.replace(ch+"","");
            int count=s1.length()-s2.length();
            s+=count+""+ch;
            s1=s2;
        }
        System.out.println(s);
        
     }
}
