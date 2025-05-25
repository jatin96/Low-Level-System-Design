package repositories;

import models.Gate;

import java.util.List;

public interface GateRepository {
    Gate insertGate(Gate gate);
    List<Gate> getAllGates();
}
