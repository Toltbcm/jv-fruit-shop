package homework.service;

import homework.model.FruitTransaction;
import homework.strategy.handler.OperationHandler;
import java.util.List;
import java.util.Map;

public interface ProcessDataService {
    void processData(List<FruitTransaction> list,
                     Map<FruitTransaction.Operation, OperationHandler> operationsMap);
}
