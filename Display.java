import java.util.HashMap;
import java.util.Map;

public class Display {
    private int floorId;
    private int totalSlots;
    private  Map<SpotType,Integer> SpotTypeToSeats ;

    public Display(int floorId,int totalSlots,Map<SpotType,Integer> SpotTypeToSeats ){
        this.floorId=floorId;
        this.totalSlots=totalSlots;
        this.SpotTypeToSeats= new HashMap<>();

    }

    public void  displayBoard(int floorId,Map<SpotType,Integer> SpotTypeToSeats){
        System.out.println("Floor Id: "+floorId);
        for(Map.Entry<SpotType,Integer> entry:SpotTypeToSeats.entrySet()){
            SpotType spotType = entry.getKey();
            Integer seats= entry.getValue();
            System.out.println("SpotType: "+spotType+"Seats: "+seats);

        }

    }
}
