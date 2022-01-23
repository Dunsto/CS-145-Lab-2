import java.awt.*;

public class Bear extends Critter{
   private boolean polar;
   private boolean bearString = true;

   public Bear(boolean polar){
      this.polar = polar;
   }
   
   public Color getColor(){
      if (polar){
         return Color.WHITE;
      } else {
         return Color.BLACK;
      }
   }
   
   public String toString() {
      if (bearString) {
         return "\\";
      } else {
         return "/";
      }
   }

   public Action getMove(CritterInfo info) {
      if (bearString){
         bearString = false;
      } else {
         bearString = true;
      }
      
      if(info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if(info.getFront() == Neighbor.EMPTY) {
         return Action.HOP;
      } else {
         return Action.LEFT;
      }
   }
}