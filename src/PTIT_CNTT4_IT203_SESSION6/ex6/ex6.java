package PTIT_CNTT4_IT203_SESSION6.ex6;

public class ex6 {

    private String id;
    private String username;
    private String password;
    private String email;

    public ex6(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        if (password != null && !password.trim().isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Password không hợp lệ");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Email không hợp lệ");
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Password: ******");
        System.out.println("Email: " + email);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        ex6 u1 = new ex6("U01", "huydao", "123456", "huydao@gmail.com");
        ex6 u2 = new ex6("U02", "testuser", "", "abc");
        ex6 u3 = new ex6("U03", "admin", "admin123", "admin@system.com");

        u1.displayInfo();
        u2.displayInfo();
        u3.displayInfo();

        u1.setPassword("");
        u1.setEmail("saiemail");

        u1.displayInfo();
    }
}

