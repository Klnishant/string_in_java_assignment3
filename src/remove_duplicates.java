import java.util.Scanner;

public class remove_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String no_duplictes = "";
        int i,j;
        char[] arr = str.toCharArray();
        for (i=0; i<arr.length; i++)
        {
            for (j=0; j<arr.length; j++)
            {
                if (arr[i]==arr[j])
                    break;
            }
            if (j==i)
            {
                no_duplictes += arr[i];
            }
        }
        System.out.println(no_duplictes);
    }
}
