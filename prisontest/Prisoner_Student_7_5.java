import cell.Cell;

//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class Prisoner_Student_7_5 {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private Cell cell;
    
    
    
    //Constructor
    public Prisoner_Student_7_5(String name, double height, int sentence, Cell cell) {
        this.name = name;
        this.height = height;
 	this.sentence = sentence;
     this.cell = cell;
    }
    
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(boolean b){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("CellName: " +cell.getCellName());
    }
    
    public void tryOpenDoor(){
        System.out.println("Prisioneiro esta tentando arrombar a porta.");
        if(!cell.isDoorOpen()){
            cell.openDoor(sentence);
        }
    }

    
    public String getName() {
        return name;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public double getHeight() {
        return height;
    }
    
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    
    public int getSentence() {
        return sentence;
    }
    
    
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }
    
    
    public Cell getCell() {
        return cell;
    }
    
    
    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
