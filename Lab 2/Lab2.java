//Group 5

//Convert the one-dimensional array to a two-dimensional one. Intialise it with character values and output those values to the screen. Use the code below. Submit the modified code by pasting it into the text field of the submission link.

public class Lab2
{

    public static void main( String args[] ){

        char values[][];
        values = new char[ 10 ][ 10];

        for( int r = 0; r < 10; r++ ){
            for( int c = 0; c < 10; c++ )
            {  
                values[r][c] = (char)('a' + c + r);
            }
        }
        for( int r = 0; r < 10; r++ ){
            for( int c = 0; c < 10; c++ )
            {  
                System.out.print(values[r][c] + " ");
            }
            System.out.println("");
        }
       
    } // main

} // Lab2