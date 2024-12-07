import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private int parkingID;
    private String parkingName;
    private List<Floor> floors;

    public ParkingLot(int parkingID,String parkingName){
        this.parkingID=parkingID;
        this.parkingName=parkingName;
        this.floors= new ArrayList<>();

    }
}
