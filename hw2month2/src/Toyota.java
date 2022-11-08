public class Toyota extends Cars{

    private String AddressB;


    public Toyota(String name, String addressB) {
        super(name);
        AddressB = addressB;
    }

    public String getAddressB() {
        return AddressB;
    }

    @Override
    public void print() {
        System.out.println("\nCars name: " + getName() +
                "\n Cars address: " + getAddressB());
    }
}
