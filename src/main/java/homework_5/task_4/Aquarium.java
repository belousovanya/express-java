package homework_5.task_4;

public class Aquarium {

   private SeaCreature seaCreature;

   public void addSeaCreature(SeaCreature seaCreature) {
       this.seaCreature = seaCreature;
   }

   public void showMovement() {
       seaCreature.move();
   }
}
