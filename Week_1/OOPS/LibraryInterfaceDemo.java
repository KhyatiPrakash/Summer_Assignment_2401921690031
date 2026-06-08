interface LibraryUser {
    void registerAccount();
    void requestBook();
}

class KidUser implements LibraryUser {

    int age;
    String bookType;

    public void registerAccount() {
        if(age < 12){
            System.out.println("You have successfully registered under a Kids Account"); 
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    public void requestBook() {
        if(bookType.equals("Kids")){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

class AdultUser implements LibraryUser {

    int age;
    String bookType;

    public void registerAccount() {
        if(age > 12){
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    public void requestBook() {
        if(bookType.equals("Fiction")){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        KidUser k1 = new KidUser();
        k1.age = 10;
        k1.bookType = "Kids";
        k1.registerAccount();
        k1.requestBook();

        KidUser k2 = new KidUser();
        k2.age = 18;
        k2.bookType = "Fiction";
        k2.registerAccount();
        k2.requestBook();

        AdultUser a1 = new AdultUser();
        a1.age = 5;
        a1.bookType = "Kids";
        a1.registerAccount();
        a1.requestBook();

        AdultUser a2 = new AdultUser();
        a2.age = 23;
        a2.bookType = "Fiction";
        a2.registerAccount();
        a2.requestBook();
    }
}
