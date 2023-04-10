package guard;

import cell.Cell;

public class Guard {
    
    public void unlockDoor(int securityCode, Cell cell){
        cell.openDoor(securityCode);
    }
}
