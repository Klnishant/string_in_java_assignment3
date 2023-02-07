import java.util.Scanner;

public class count_character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int count_vowel=0,count_constant=0,count_spl_char=0;
        System.out.println("Enter the string");
        str = sc.nextLine();

        char[] arr = str.toCharArray();

        for (int i=0; i<arr.length; i++)
        {
            if ((arr[i]>=33 && arr[i]<=47) || arr[i]>=58 && arr[i]<=64)
            {
                count_spl_char++;
            }
            else if (arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'
             || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U')
            {
                count_vowel++;
            }
            else if (!(arr[i]>=48 && arr[i]<=57))
            {
                count_constant++;
            }
        }
        System.out.println("vowels:" + count_vowel);
        System.out.println("consonant:" + count_constant);
        System.out.println("special character:" +count_spl_char);
    }
}
