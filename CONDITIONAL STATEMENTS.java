import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

    // conditional statements

    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER YOUR AGE:");
    int age = sc.nextInt();


    if(age>18)
    System.out.println("can vote");
    
    else
    System.out.println("can't vote");


    Scanner st = new Scanner(System.in);
    System.out.println("ENTER YOUR MARKS ");
    int marks = st.nextInt();


    if(marks>33)
    System.out.println("pass");

    else
    System.out.println("fail");
       
 }
}

    

    
