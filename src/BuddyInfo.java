

public class BuddyInfo {

    private String firstName;
    private String lastName;
    private String address;

    private String contactNumber;


    private String email;

    public BuddyInfo(String firstName, String lastName, String address, String contactNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public BuddyInfo(){
        this.firstName = "Yacine";
        this.lastName = "Djaou";
        this.address = "Ottawa";
        this.contactNumber = "234234324";
        this.email = "dfsgsd@gmail.com";
    }

    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Yacine","Djaou","asfdsf","4324234","asdf@gmail.com");
        System.out.println("Hello " + buddy1.getFullName());
    }

    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}