public class Subaru extends Cars{

    private String AddressC;


    public Subaru(String name, String addressC) {
        super(name);
        AddressC = addressC;
    }

    public String getAddressC() {
        return AddressC;
    }

    @Override
    public void print() {
        System.out.println("\nCars name: " + getName() +
                "\n Cars address: " + getAddressC());
    }
}
