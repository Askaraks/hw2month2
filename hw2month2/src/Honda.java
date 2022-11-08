public class Honda extends Cars{

    private String Address;


    public Honda(String name, String address) {
        super(name);
        Address = address;
    }

    public String getAddress() {
        return Address;
    }

    @Override
    public void print() {
        System.out.println("\nCars name: " + getName() +
                "\nCars address: " + getAddress());

    }
}

