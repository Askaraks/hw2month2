public class Main {



    public static void main(String[] args) {
        createObjects("Honda").print();
        createObjects("Toyota").print();
        createObjects("Subaru").print();



    }

    public static Cars createObjects(String className){
        switch (className){
            case "Honda":
                return new Honda("jazz", "Japanese");
            case "Toyota":
                return new Toyota("Avalon", "Japanese");
            case "Subaru":
                return new Subaru("Legacy", "Japanese");
            default:
                return null;
        }

        }






}

