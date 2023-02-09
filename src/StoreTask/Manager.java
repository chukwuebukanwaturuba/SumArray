package StoreTask;

public class Manager extends Staff {

    public Manager(String storeName, String name, String staffID) {
        super(storeName, name, staffID);
    }

    @Override
    public String toString() {
        return "Manager{} " + super.toString();

    }
}



