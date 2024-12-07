import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Floor {
    private String floorName;
    private  int floorId;
    List<Spot> spotsList;
    private Display displayBoard;

    public Floor(String floorName,int floorId){
        this.floorName=floorName;
        this.floorId=floorId;
        this.spotsList= new ArrayList<>();
    }

    public void setFloorName(String floorName){
        this.floorName=floorName;
    }
    public String getFloorName(){
        return this.floorName;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public List<Spot> getSpotsList() {
        return spotsList;
    }

    public void setSpotsList(List<Spot> spotsList) {
        this.spotsList = spotsList;
    }
}
