public class Display {
    private final Grid grid;

    Display(Grid globalGrid){
        grid = globalGrid;
    }

    public void grid(){
        for(int row = 0; row < 10; row++){
            for(int col = 0; col < 10; col++){
                System.out.print(grid.getValue(row,col) + " ");
            }
            System.out.println("");
        }
    }
}
