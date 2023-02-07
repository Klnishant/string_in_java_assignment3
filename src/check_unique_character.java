import java.util.Scanner;
public class check_unique_character {
    public static boolean check(char[] arr1)
    {
        for (int i=0; i<arr1.length; i++)
        {
            for (int j =i+1; j<arr1.length; j++)
            {
                if (arr1[i] == arr1[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;
        System.out.println("Enter the string");
        str1 = sc.next();

        //convert string in to array
        char[] arr1 = new char[str1.length()];

        boolean flag = check(arr1);
        if (flag)
        {
            System.out.println("Entered string have unique character");
        }
        else
        {
            System.out.println("Entered string do not have unique character");
        }
    }
}
