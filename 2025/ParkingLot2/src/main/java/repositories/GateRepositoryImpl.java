package repositories;

import models.DisplayBoard;
import models.Gate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GateRepositoryImpl implements GateRepository {
    Map<Integer, Gate> gateByNumber = new HashMap<>();
    @Override
    public Gate insertGate(Gate gate) {
        gateByNumber.put(gate.getGateNumber(), gate);
        return gate;
    }

    @Override
    public List<Gate> getAllGates() {
        return gateByNumber.values().stream().toList();
    }
}
