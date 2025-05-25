package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Gate {
    private int gateNumber;
    private GateType gateType;
    private GateStatus gateStatus;

    @Override
    public String toString() {
        return "Gate{" +
                "gateNumber=" + gateNumber +
                ", gateType=" + gateType +
                ", gateStatus=" + gateStatus +
                '}';
    }
}
