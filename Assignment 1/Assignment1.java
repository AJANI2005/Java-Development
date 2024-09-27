
public class Assignment1
{

    //Test Functions


    public void TestRound(){
        Tools t = new Tools();
        int input[] = {5,4,42,88,70,40};
        int output[] = {6,3,41,89,71,39};
        System.out.println("Round(int value)");
        for(int i = 0; i < input.length; i++){
            System.out.print(Integer.toString(input[i]) + " --> " + Integer.toString(output[i]));

            if (t.round(input[i]) == output[i]){
                System.out.println(" Passed");
            }else{
                System.out.println(" Failed");   
            }
        }

    }

        

    public static void main( String args[] )
    {
       Assignment1 a = new Assignment1();
       a.TestRound();
      
      
       Tools t = new Tools();
       int nums[] = {1,2,-3,4,5};
       t.clear(nums,2);
       
       for(int i = 0; i < nums.length; i++){
         System.out.print(nums[i] + ",");
       }


    } // main
} // Assignment1
