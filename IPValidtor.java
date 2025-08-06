import java.util.Scanner;
public class IPValidtor {
    public static void  main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a valid IP adress: ");
        String ip = sc.nextLine().trim();
        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String regex= zeroTo255 + "\\." +zeroTo255 + "\\." +zeroTo255 + "\\." +zeroTo255;
        if(ip.matches(regex)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
