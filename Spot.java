public class Spot {
    private int spotId;

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    private SpotType spotType;
    public Spot(int spotId,SpotType spotType){
        this.spotId=spotId;
        this.spotType=spotType;
    }


}
