package StoreTask;

public class Person extends Store{

    private String name;

    public Person(String storeName, String name) {
        super(storeName);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
