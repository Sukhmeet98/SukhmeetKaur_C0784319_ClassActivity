package SukhmeetKaur_C0784319_ClassActivity;

public class Class_Activity
{

    public static void main(String[] args)
    {
        String Str = "hello hello how Are you HELLO are there happy test you";
        String[] arr = Str.split(" ");
        String[] element = new String[arr.length];
        int[] count = new int[arr.length];
        int j = 0;
        boolean present = true;
        for(int i = 0; i < arr.length;i++)
        {
            for(int k = 0; k<=j; k++)
            {
                if(arr[i].equalsIgnoreCase(element[k]))
                {
                    count[k] +=1;
                    present = true;
                    break;
                }else
                    {
                    present = false;
                }
            }
            if (!present)
            {
                element[j] = arr[i];
                count[j] = 1;
            }
            j += 1;
        }
        for (int k = 0; k< count.length; k++)
        {
            if (!(count[k] == 0))
            {
                System.out.println(element[k] + " -> " + count[k]);
            }
        }
    }

}
