/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

//import java.util.Scanner;

class Scarecrow {

    /* Parts of the Scarecrow, we call upon all the other classes that we have created. 
     * @param none 
     * @return none 
     */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot both;
    private Banner sign;
    private String message;

    /* Constructor
     * TODO: initialize remaining parts
     */
    public Scarecrow(Pumpkin h, Shirt b, Pants l,  Boot bth) {
        head = h;
        body = b;
        legs = l;
        both = bth;
        message = "Happy Fall <3";
    }

    /* Displays the Scarecrow by displaying the differnt body parts of the Scarecrow in order. 
     * @param none 
     * @return none 
    */
    public void display() {

        head.display();
        body.display();
        legs.display();
        both.display();
    
    }

    /* Main method (for testing) */
    public static void main(String[] args) {

        // TODO: Don't forget to update the line below if you modify the constructor
        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants (), new Boot("both"));

        // If a message was passed in on the command line, extract and store it
        // TODO: in Step 4, you'll pass this value along to your Banner constructor
        
        if (args.length > 0) {
            myScarecrow.message = args[0];
            //myScarecrow.message = args [1];

        }
        Banner myBanner = new Banner(myScarecrow.message);
        myBanner.display();
        myScarecrow.display();
    }

}
