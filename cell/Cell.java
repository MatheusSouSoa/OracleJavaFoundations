package cell;
public class Cell {
    
    private String cellName;
    private boolean doorIsOpen;
    private int securityCode;

    public Cell(String cellName, boolean doorIsOpen,int securityCode)  {
        this.cellName = cellName;
        this.doorIsOpen = doorIsOpen;
        this.securityCode = securityCode;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public boolean isDoorOpen() {
        return doorIsOpen;
    }

    public void setDoorIsOpen(boolean doorIsOpen) {
        this.doorIsOpen = doorIsOpen;
    }

    //abrir porta
    public void openDoor(int securityCode) {
       
        if(securityCode == this.securityCode){
            if(this.isDoorOpen()){
                this.setDoorIsOpen(false);
                System.out.println("Fechando a porta: " + this.getCellName());
            }else{
                this.setDoorIsOpen(true);
                
                System.out.println("Abrindo a porta: " + this.getCellName());
            }
        }
        else{
            System.out.println("Acesso negado");
        }
        
    }


}
