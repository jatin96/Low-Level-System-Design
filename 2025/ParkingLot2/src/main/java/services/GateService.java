package services;

import models.DisplayBoard;
import models.EntryGate;
import models.ExitGate;
import models.Operator;

public interface GateService {
    EntryGate createEntryGate(int gateNumber);
    ExitGate createExitGate(int gateNumber);
}
