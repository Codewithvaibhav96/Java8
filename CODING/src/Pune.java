public class Pune {

    //Name is mandatory

    //Age between 18 and 40 then address is mandatory

    // age less than 18 or more than 40 then address is optional


    private String name;
    private int age;
    private String address;


    public void validate() {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name is mandatory");
        }

        if (age >= 18 && age <= 40) {
            if (address == null || address.trim().isEmpty()) {
                throw new IllegalArgumentException("Address is mandatory");
            }
        }
    }




}




