public class Grid {
    private final Position data[][];

    Grid(){
        data = new Position[10][10];

        //Initialize Grid
        for(int row = 0; row < 10; row++){
            for(int col = 0; col < 10; col++){
                data[row][col] = new Position('_');
            }
        }
    }


    void setValue(int row, int col,char value){
        data[row][col].setValue(value);
    }
   
    char getValue(int row, int col){
        return data[row][col].getValue();
    }

    void reset() {
        for(int row = 0; row < 10; row++){
            for(int col = 0; col < 10; col++){
                data[row][col].setValue('_');
            }
        }
    }
}
