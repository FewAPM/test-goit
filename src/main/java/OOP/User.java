package OOP;

class User {
    private String firstName;
    private String secondName;

    public User(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;

    }

    class NameFormatter {
        public String getFormatted(){
            return "FirstName is " + firstName + " SecondName is " + secondName;
        }

    }
    public void printFormattedName() {
        String formattedName = new NameFormatter().getFormatted();
        System.out.println(formattedName);
    }
}

class UserTest{
    public static void main(String[] args) {
        new User("John", "Doe").printFormattedName();
    }
}
