package OOP;

class User {
    private boolean admin;
    private String name;

    public User(String name){
        this(name, false);
        System.out.println("first construcotr");
    }
    public User(String name, boolean admin) {
        this.name = name;
        this.admin = admin;

        System.out.println("Name is " + name + ", is admin: " + admin);
        System.out.println("Second construcotr");
    }

    public static void main(String[] args) {
        new User("Marina");
        new User("Mark", true);
    }
}