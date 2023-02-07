import java.util.Scanner;

public class print_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        String new_string ="";

        System.out.println("Enter the string");
        str = sc.nextLine();

        char[] arr = str.toCharArray();

        for (int i=0; i<arr.length; i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                if (arr[i]==arr[j])
                {
                    new_string += arr[j];
                }
            }
        }
        System.out.println(new_string);
    }
}
