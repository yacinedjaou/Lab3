import java.util.ArrayList;
import java.util.Objects;

public class AddressBook {
    ArrayList<BuddyInfo> buddies = new ArrayList<>();

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Yacine","Djaou","Ottawa","2342342342","sdahfjkl@gmail.com");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy("Yacine","Djaou");
    }

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    public void removeBuddy(String firstName, String lastName){
        for(BuddyInfo buddy: buddies){
            if(Objects.equals(buddy.getFullName(), firstName + " " + lastName)){
                buddies.remove(buddy);
            }
        }
    }
}
