public class StringLiterals{
    public static void main(String[] args)
    {
        String fname = new String("Shivam");
        String fname2 =  "Shivam";
        if(fname == fname2){
            System.out.println("True return by == ");
        }else{
            System.out.println(fname.equals(fname2));
            
        }

        String str = "Shivam";
        String str2 = "Yadav";
        System.out.println(str.compareTo(str2));
        System.out.println(str.substring(0,4));

    }
}