import java.util.*;
public class noOfWords
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String in = sc.nextLine();
        in = in.trim();
        in = in + " ";
        int len = in.length();
        int c = 0;
        for(int i = 0; i < len; i++)
        {
             if(in.charAt(i)==' ')
                c++;
        }
        String arr[] = new String[c];
        System.out.println("There are " + c + " words in the entered sentence.");
        int c1 = 0;
        int j = 0;
        for (int i = 0; i < c; i++) {
              arr[i] = "";
        }
        while(c1<c && j < len)
        {
            if(in.charAt(j)!=' ' && in.charAt(j)!=',' && in.charAt(j)!='.' && in.charAt(j)!='!' && in.charAt(j)!='?' && in.charAt(j)!=';' && in.charAt(j)!=':')
                arr[c1] = arr[c1] + in.charAt(j);
            else if(in.charAt(j)==' ')
                c1++;
            j++;
        }
        System.out.println("The words in the entered sentence : ");
        for(j = 0; j < c; j++)
        {
            System.out.println("Word " + (j+1) + " : " +arr[j]);
        }
        }
}
