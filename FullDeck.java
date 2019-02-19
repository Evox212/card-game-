//Filename: FullDeck.java
//Author: Damian lester
//Date:2.11.19
/**
 * Using the card2.java class, this program will create an array of 52 card
 * objects, assigning Differnt value to each card and displaying the cards
 */

public class FullDeck 
{
    public static void main(String[] args) {
        // Variables and constants
        final int CARDS_IN_DECK = 52;
        Card[] cardArr = new Card[CARDS_IN_DECK];
        int value = 1;
        int suit = 1;

        //This for loop will generate all 52 cards in order
        for(int x = 0; x < cardArr.length; x++)
        {
            cardArr[x] = new Card();

            //Start the suit variable at 0 and sign a different string based on this number for the suit
            switch(suit)
            {
                case 1: 
                {
                    cardArr[x].setSuit("Spades");
                    break;
                }
                case 2: 
                {
                    cardArr[x].setSuit("Hearts");
                    break;
                }
                case 3:
                {
                    cardArr[x].setSuit("Diamonds");
                    break;
                }
                case 4:
                {
                    cardArr[x].setSuit("Clubs");
                    break;
                }
            }

            cardArr[x].setValue(value);
            System.out.println(cardArr[x].getRank() + " of" +  cardArr[x].getSuit());
            value++; //Changes this variables before we loop again 

            //Decide if we are done with a suit or not
            if(value > 13) 
            {
                suit++;
                value = 1;
            }

        }//End of the for loop

        System.out.println("\n\nCard deck is complete......");
    }
}