public class Game {
    private final Menu menu;
    private final Input input;
    private final Display display;
    private final Grid grid;
    private final Generator generator;

    Game(){
        menu = new Menu();
        input = new Input();
        grid = new Grid();
        display = new Display(grid);
        generator = new Generator(grid);
    }
    void run(){
        int generations = 0;
        while(true){

           
            display.grid();
            System.out.println("Generation: " + generations);
            menu.display();

            System.out.print(">");
            int choice = input.getInt();
            switch (choice){
                case 1 : //Generate species members randomly.
                    System.out.print("Number of members to add: ");
                    int membersToAdd = input.getInt();

                    for (int i = 0; i < membersToAdd; i++){
                        
                        int row = (int)(Math.random() * 10);
                        int col = (int)(Math.random() * 10);
                       
                        setValue(row, col, 'X');
                    }
                    break;
                case 2 : //Step through each generation.
                    generate();
                    generations++;
                    break;
                case 3 : //Execute a specified number of generations.
                    System.out.print("Number of generations: ");
                    int genCount = input.getInt();

                    for (int i = 0; i < genCount; i++){
                        generate();
                        generations++;
                    }

                    break;
                case 4 : //Exit the simulation.
                    System.out.println("System exiting...");
                    return;
                    
            }
        }
    } 
    void generate(){
        generator.generate();
    } 

    void setValue(int row, int col, char value){
        grid.setValue(row, col, value);
    }
   
    char getValue(int row, int col){
        return grid.getValue(row,col);
    } 
}
