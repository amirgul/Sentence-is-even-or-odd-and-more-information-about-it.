import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program will find which sentence is even, odd \nAnd some other information about sentence");
        String response = null;
        String sentence;
        do
            {
                System.out.println("please enter a sentence");
                sentence = keyboard.nextLine();
                char last = sentence.charAt(sentence.length()-1);
                if((sentence.length()%2==0)&&(last == '?'))
                {
                    System.out.println("sentence is even");
                    System.out.println("YES  " + " \"and length is\" "+  sentence.length());
                }
                else if ((sentence.length()%2==1)&&(last =='?'))
                {
                    System.out.println("sentence is odd");
                    System.out.println("NO " + " \"and length is\" " + sentence.length());
                }
                else if(last =='!')
                {
                    System.out.println("We don't check length only last char");
                    System.out.println("WOW");
                }
                else if((last != '?')&&(last != '!'))
                {
                    System.out.println("you always say that " + "\"" + sentence  + "\"" + "");

                }
                System.out.println("do you wanna try another sentence");
                System.out.println("please enter yes or no");
                response = keyboard.nextLine();
            }while (!(response.equalsIgnoreCase("No")));

        System.out.println("I will rest now have a good day!");


    }
}
