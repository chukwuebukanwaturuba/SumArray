package StoreTask;

public class Staff extends Person{

    private String staffID;

    public Staff(String storeName, String name, String staffID) {
        super(storeName, name);
        this.staffID = staffID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffID='" + staffID + '\'' +
                "} " + super.toString();
    }
}
