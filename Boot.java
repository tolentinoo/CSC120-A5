/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Boot {
  
    private String direction;
  
    /* Constructor */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /*
     * Print ASCII Art Boot, creates the boots and mirrors them
     * @param none
     * @return void 
     */
    public void display() {
        if (this.direction.equals("left")) {
          //System.out.println("Left boot?");
          System.out.print("|______|");
        } else if (this.direction.equals("right")) {
          //System.out.print("Right boot?");
          System.out.print("|______|");
        } else if (this.direction.equals("both")){
          System.out.println("       |______||______|");
        }
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
