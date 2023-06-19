package zerobase.wifi;

import zerobase.wifi.dto.PosHistoryDto;
import zerobase.wifi.model.PosHistoryModel;

public class Main {
    public static void main(String[] args) {
        PosHistoryDto posHistoryDto = new PosHistoryDto();
        PosHistoryModel A = new PosHistoryModel();
        A.setX좌표("5");
        A.setY좌표("5");
        posHistoryDto.insert(A);
    }
}
