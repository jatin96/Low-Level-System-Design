package services;

import lombok.AllArgsConstructor;
import models.*;
import repositories.GateRepository;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class GateServiceImpl implements GateService {

//    private final GateRepository gateRepository;
    @Override
    public EntryGate createEntryGate(int gateNumber) {
        return new EntryGate(gateNumber, new DisplayBoard(0,0,0,0), GateType.ENTRY, GateStatus.CLOSED);
    }

    @Override
    public ExitGate createExitGate(int gateNumber) {
        return new ExitGate(gateNumber, GateType.EXIT, GateStatus.CLOSED);
    }
}
