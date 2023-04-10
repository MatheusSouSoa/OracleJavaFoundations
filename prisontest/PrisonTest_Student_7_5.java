import cell.Cell;
import guard.Guard;

//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest_Student_7_5 {
    public static void main(String[] args){
        
        Cell cell01 = new Cell("C01",false,5463);

        Prisoner_Student_7_5 bubba = new Prisoner_Student_7_5("Bubba", 2.08, 4,cell01);

        bubba.display(true);
        bubba.tryOpenDoor();

        Guard guard = new Guard();
        guard.unlockDoor(5643, cell01);
        guard.unlockDoor(5463, cell01);

    }
}
