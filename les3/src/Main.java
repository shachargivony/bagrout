import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
//        System.out.println("Enter something: ");
//        String word = myObj.nextLine();
//        int count = 0;
//        for(int i =0; i < word.length(); i++)
//        {
//            char c = word.charAt(i);
//            if (c != ' ')
//            {
//                count+=1;
//            }
//
//        }
//        System.out.println("There are " + count + " letters");

//        ex3

//        System.out.println("Enter word: ");
//        String word1 = myObj.nextLine();
//        int let_Count = 0;
//        for (int j = 0; j < word1.length(); j++)
//        {
//            char Rc = word1.charAt(j);
//            char Lc = word1.charAt(word1.length()-j-1);
//            if(Rc == Lc)
//            {
//                let_Count +=1;
//            }
//
//        }
//        if (let_Count == word1.length())
//            System.out.println("The word is polindrom");
//        else
//            System.out.println("The word isn't polindrom");

//        ex4

//        System.out.println("Enter word: ");
//        String word3 = myObj.nextLine();
//        String new_word = "";
//        for (int k = 0; k<word3.length(); k++){
//            char c = word3.charAt(word3.length()-1-k);
//
//            new_word += c;
//        }
//        System.out.println(new_word);


        System.out.println("Enter number: ");
        int num = myObj.nextInt();
        int a=0,b=1;

        a = a+b;
        b = a+b;

        for (int i =2; i<10;i++){
            System.out.println((a+b));
            a++;
            b++;
        }






    }
}