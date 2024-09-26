import java.util.ArrayList;
import java.util.Objects;

public class AddressBook {
    ArrayList<BuddyInfo> buddies = new ArrayList<>();


    public AddressBook() {
    }


    public AddressBook(ArrayList<BuddyInfo> buddies) {
        this.buddies = buddies;
    }


    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Yacine", "Djaou", "Toronto", "2342342342", "djaouyacine@gmail.com");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);

    }


    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index <= buddies.size()) {
            return buddies.remove(index);
        }
        return null;
    }
}
