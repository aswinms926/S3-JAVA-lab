import java.util.Scanner;
public class frequency {
    public static void main(String args[]) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        str = sc.nextLine();
        char[] a = str.toLowerCase().toCharArray();
        int n = a.length;
        int flah = 0, i = 0;
        System.out.println("Enter character whose frequency is to be found : ");
        char b = sc.nextLine().toLowerCase().charAt(0);
        for (i = 0; i < n; i++) {
            if (b == a[i]) {
                flah++;
            }
        }
        System.out.println("The character frequency is  " + flah);
    }
}
