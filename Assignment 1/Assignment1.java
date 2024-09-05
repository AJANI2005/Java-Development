
public class Assignment1
{

    public static void main( String args[] )
    {
        Tools t = new Tools();
       
        
        int[] arr = {-2,3,2,-4,5};
        t.clear(arr,2);

        for(int n : arr){
            System.out.print(Integer.toString(n).concat(", "));
        }
        
       


    } // main
} // Assignment1
