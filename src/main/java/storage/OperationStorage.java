package storage;

import entity.Operation;

import java.util.ArrayList;
import java.util.List;

public class OperationStorage {
    private static List<Operation> operations = new ArrayList();

    public void add(Operation operation){
        operations.add(operation);
    }

    public List<Operation> getAll(){
        return new ArrayList<>(operations);
    }
}
