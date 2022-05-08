
class QueenAttackCalculator{
    Queen q1;
    Queen q2;
     QueenAttackCalculator (Queen q1, Queen q2){
        this.q1=q1;
        this.q2=q2;
        if ((this.q1==null) || (this.q2==null))
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");    
        else if ((this.q1.x==this.q2.x) && (this.q1.y==this.q2.y))
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
        
    }
    
    boolean canQueensAttackOneAnother(){
        int a=this.q1.x;
        int b=this.q1.y;
        int c=this.q2.x;
        int d=this.q2.y;
        
        if ((a==c) || (b==d) || ((a-b)==(c-d)) || (a+b)==(c+d)){
            return true;
        }
        else return false;
    }
}
class Queen{
    int x;
    int y;
        Queen (int x, int y){
            this.x=x;
            this.y=y;   
            if (this.x<0)//||(this.q2.x<0)) 
            throw new IllegalArgumentException("Queen position must have positive row.");
        else if (this.x>7)//||(this.q2.x>7))
            throw new IllegalArgumentException("Queen position must have row <= 7.");

        else if (this.y<0)//||(this.q2.y<0)) 
            throw new IllegalArgumentException("Queen position must have positive column.");
        else if (this.y>7)//||(this.q2.y>7)) 
            throw new IllegalArgumentException("Queen position must have column <= 7.");
        }
    }