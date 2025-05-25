package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntryGate extends Gate {
    public EntryGate(int gateNumber, DisplayBoard displayBoard, GateType type, GateStatus status) {
        super(gateNumber, type, status);
    }
}
