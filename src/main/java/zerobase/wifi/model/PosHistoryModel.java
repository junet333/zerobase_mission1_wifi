package zerobase.wifi.model;


public class PosHistoryModel {

    private int ID;
    private String x좌표;
    private String y좌표;

//    public void setID(int ID) {
//        this.ID = ID;
//    }

    public void setX좌표(String x좌표) {
        this.x좌표 = x좌표;
    }

    public void setY좌표(String y좌표) {
        this.y좌표 = y좌표;
    }

    public int getID() {
        return ID;
    }

    public String getX좌표() {
        return x좌표;
    }

    public String getY좌표() {
        return y좌표;
    }
    public PosHistoryModel() {
    x좌표 = "3";
    y좌표 = "3";
    }
}


