import java.util.Scanner;

public class AlphabetVowelOrNot {
    public static void main(String[] args) {
        // Input a e i o u -> Vowels

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        //String str = sc.next();
       /* switch (alphabet){
            case "a" : System.out.println("a is Vowel");break;
            case "e" : System.out.println("e is Vowel");break;
            case "i" : System.out.println("i is Vowel");break;
            case "o" : System.out.println("o is Vowel");break;
            case "u" : System.out.println("u is Vowel");break;
            case "A" : System.out.println("A is Vowel");break;
            case "E" : System.out.println("E is Vowel");break;
            case "I" : System.out.println("I is vowel");break;
            case "O" : System.out.println("O is Vowel");break;
            case "U" : System.out.println("U is Vowel");break;
            default: System.out.println(alphabet+ " is Consonant");break;
*/
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println(ch + " is vowel");
        }
        else
        {
            System.out.println(ch + " is consonant");
        }

        }

    }

