package sudoku.utils;

// The keyword "public" is an "access modifier" of the class.
public class Sudoku {
    // this declarates a two-dimentional array.
    // as we can see, access modifiers can be used 
    // for both classes and variables.

    // These are "member variables":
    private int[][] gridState;
    private GameState

    // Create a constructor method:
    public Sudoku(int[][] gridState, GameState gameState){
        // above we have two "parameter variables"
        // they only exist as long as the program is executing
        // this particular method.
        // we want to use them as temporary values to our member variables.
        this.gridState = gridState;
        this.gameState = gameState;
    }

    // This is a getter type acceser method.
    public int[][] getGridState() {
        return this.gridState;
    }

    public void setGridState(int[][] gridState) {
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    // The 4 types of access modifiers in Java:
    // public
    // protected
    // nothing 
    // private

}
