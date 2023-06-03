import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {
        // arrays

        int[] marks=new int[3];
        marks[0]=97;
        marks[1]=95;
        marks[2]=92;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //length 

        System.out.println(marks.length);

        //sort
         
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        
        
        // 2 d array
        
        int[] Marks ={97,95,93};

        int[][] FinalMarks={{98,95,93},{92,93,97}};

        System.out.println(FinalMarks[0][0]);
        System.out.println(FinalMarks[1][1]);



       

    }
}
