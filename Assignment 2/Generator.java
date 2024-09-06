

public class Generator {
    private final Grid grid;

    Generator(Grid globalGrid) {
        grid = globalGrid;
    }
    
    public void generate(){
        
        //2dim arrays for delayed updates to grid
        boolean toAdd[][] = new boolean[10][10];
        boolean toRemove[][] = new boolean[10][10];

        for(int row = 0; row < 10; row++){
            for(int col = 0; col < 10; col++){
                //Overcrowding Rule
                int neighbours = 0;
                if(grid.getValue(row,col) == 'X'){
                    for(int i = -1;i <= 1; i++){
                        for(int j = -1; j <= 1; j++){

                            if (i == 0 && j == 0){
                                //Skip if checking self
                                continue;
                            }

                            int checkRow = row + i;
                            int checkCol = col + j;
                            
                            if(checkRow < 0 || checkRow > 9){
                                //Skip if not on grid
                                continue;
                            }

                            //Wrap around column if out of bounds
                            if(checkCol < 0){
                                checkCol = 9;
                            }else if(checkCol > 9){
                                checkCol = 0;
                            }

                            if(grid.getValue(checkRow,checkCol) == 'X'){
                                neighbours += 1;
                            }
                        }
                    }
                    if(neighbours >= 5){
                        toRemove[row][col] = true;
                        continue; //Skip Hatching Rule and go to next column
                    }

                }

                //Hatching Rule
                if(row < 9){
                    int freeRow = -1;
                    int freeCol = -1;
                    boolean canHatch = true;
                    for(int i = 0; i <= 1;i++){
                        for(int j = 0; j <= 1;j++){
                            //Check for three occupied cells and one empty cell
                            int checkRow = row + i;
                            int checkCol = col + j;

                            if (checkCol > 9){
                                checkCol = 0;
                            }

                            if(grid.getValue(checkRow,checkCol) == '_'){

                                //Current cell is free and is the first free cell
                                if (freeRow == -1 && freeCol == -1){
                                    freeRow = checkRow;
                                    freeCol = checkCol;
                                }else{
                                    canHatch = false;
                                }
                            }
                        }
                    }
                    //(Hatch new member)
                    if (canHatch && freeRow != -1 && freeCol != -1){
                        toAdd[freeRow][freeCol] = true;
                    }
                }



            }
        }

        for(int row = 0; row < 10; row++){
            for(int col = 0; col < 10; col++){
                if(toAdd[row][col]){
                    grid.setValue(row,col,'X');
                }
                if(toRemove[row][col]){
                    grid.setValue(row,col,'_');
                }
            }
        }
    }
}
