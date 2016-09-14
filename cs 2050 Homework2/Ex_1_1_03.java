public class Ex_1_1_03{
 public static void main( String[] args){
   
   if (args.length == 3)
        {
                    

        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++)
            numbers[i] = Integer.parseInt(args[i]);

        if ((numbers[0] == numbers[1]) && (numbers[0] == numbers[2]))
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}
}







