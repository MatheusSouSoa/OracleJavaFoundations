import cell.Cell;

//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class Prisoner_Student_7_5 {
    //Fields 
    private static int prisonerCount = 0;
    private String name;
    private double height;
    private int sentence;
    private Cell cell;
    private int bookingNumber;
    public static final int MAX_PRISONER_COUNT = 100;
    
    
    
    //Constructor
    public Prisoner_Student_7_5(String name, double height, int sentence, Cell cell) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cell = cell;
        prisonerCount++;
        this.bookingNumber = prisonerCount;
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
        System.out.println("prisoner booking number: " +this.getBookingNumber());
        System.out.println("prisoner count: " +prisonerCount);
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

        
    public static int getPrisonerCount() {
        return prisonerCount;
    }


    public int getBookingNumber() {
        return bookingNumber;
    }
}
