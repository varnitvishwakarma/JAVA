public class Main {
    public static void main(String[] args) {
        //strings

        // CONCATENATE

        String name="varnit";
        String surname="vishwakarma";
        String FullName =name+" "+surname;
        System.out.println(FullName);
        
        //CharAt

        String name ="varnit";
        System.out.println(name.charAt(5));
        
        //Length

        String name="varnit vishwakarma";
        System.out.println(name.length());
        
        
       //Replace

       String name ="varnit";
       String name2 = name.replace('i','I');
       System.out.println(name2);
       System.out.println(name);

       //Substring

       String Name="varnit vishwakarma";
       System.out.println(name.substring(0,3));
