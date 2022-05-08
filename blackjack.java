public class Blackjack {

    public int parseCard(String card) {
        int a=0;
        switch(card){
            case "ace": a=11; break;
            case "two": a=2; break;
            case "three": a=3; break;
            case "four": a=4; break;
            case "five": a=5; break;
            case "six": a=6; break;
            case "seven": a=7; break;
            case "ten": case "jack": case "queen": case "king": a=10; break;
            case "eight": a=8; break;
            case "nine": a=9; break;
            case "other": a=0; break;
        }
        return a;
    }

    public boolean isBlackjack(String card1, String card2) {
        return (parseCard(card1)+parseCard(card2)==21);
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (!isBlackjack) return "P";
        else{
            if (dealerScore<10) return "W";
            else return "S";
        }
        //switch()
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore>=17) return "S";
        else if (handScore<=11) return "H";
        else if (dealerScore>=7) return "H";
        else return "S";}

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
