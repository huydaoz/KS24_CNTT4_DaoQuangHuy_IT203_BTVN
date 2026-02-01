package PTIT_CNTT4_IT203_SESSION6.ex2;

public class ex2 {

    private String username;
    private String password;
    private String email;

    public ex2(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Password: ******");
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {

        ex2 acc = new ex2("huydao", "123456", "huydao@gmail.com");

        acc.displayInfo();

        acc.changePassword("abcdef");

        acc.displayInfo();
    }
}

