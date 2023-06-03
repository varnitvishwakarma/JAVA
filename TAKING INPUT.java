
import java.util.Scanner;
//import java.util.Scanner.throwFor;

class HelloWorld {
    public static void main(String[] args) {

    //how to take input?
    
    Scanner sc = new Scanner(System.in);
    System.out.println("INPUT YOUR AGE:");
    int age = sc.nextInt();
    System.out.println(age);

    // INPUT A STRING (SINGLE WORD)
    
    Scanner st = new Scanner(System.in);
    System.out.println("ENTER YOUR NAME");
    String name = st.next();
    System.out.println("YOUR NAME IS "+ name );

     // INPUT A STRING (LINE )

    Scanner SCC = new Scanner(System.in);
    System.out.println("ENTER YOUR FULL NAME");
    String Name = SCC.nextLine();
    System.out.println("YOUR FULL NAME IS "+ Name );


   
            
        }
    }
    

    
