/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /*
     * Print a decorative banner, resized to fit the message. 
     * @param none 
     * @return none 
     */
    public void display() {
        //first row of the banner
        System.out.print("  *****");
        for (int i =0; i< this.message.length(); i++){
            System.out.print("*");
        }
        System.out.println();

        //second row of the banner
        System.out.print("*** ");
        for (int i =0; i<this.message.length();i++){
            System.out.print("~");
        }
        System.out.println("~~ ***");

        //middle row of the banner 
        System.out.println("*** ~ " + this.message + " ~ ***");

        //fourth row of the banner
        System.out.print("  *** ");
        for (int i =0; i<this.message.length();i++){
            System.out.print("~");
        }
        System.out.println(" ***");

        //fifth row of the banner 
        System.out.print("   ");
        for (int i=0; i<this.message.length();i++){
            System.out.print("*");
        }
        System.out.println("  ***");

        //last row of the banner 
        for (int i =0; i<this.message.length();i++){
            System.out.print(" ");
        }
        System.out.println("*******");
        

    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("whats up northampton");
        myBanner.display();
    }
}
