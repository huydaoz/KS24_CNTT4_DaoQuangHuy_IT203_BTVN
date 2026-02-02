package PTIT_CNTT4_IT203_SESSION7.ex6;

import java.util.ArrayList;

public class ex6 {

    static class User {
        public final int id;
        public String username;
        public String password;

        public User(int id, String username, String password) {
            this.id = id;
            this.username = username;
            this.password = password;
        }

        @Override
        public String toString() {
            return "User[id=" + id + ", name=" + username + "]";
        }
    }

    static class UserManager {
        public static ArrayList<User> users = new ArrayList<>();

        public static void addUser(User user) {
            users.add(user);
        }

        public static boolean checkLogin(String username, String password) {
            for (User user : users) {
                if (user.username.equals(username) &&
                        user.password.equals(password)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {

        User u1 = new User(1, "dev_a", "123456");
        User u2 = new User(2, "dev_b", "abcdef");
        User u3 = new User(3, "dev_c", "qwerty");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println(">> Đã thêm 3 user vào hệ thống.");
        System.out.println("Danh sách hiện tại:");

        int index = 1;
        for (User user : UserManager.users) {
            System.out.println(index + ". " + user);
            index++;
        }

        System.out.println();
        System.out.println(">> Kiểm tra đăng nhập:");

        System.out.println(
                "- Login (\"dev_a\", \"123456\"): " +
                        (UserManager.checkLogin("dev_a", "123456") ? "Thành công!" : "Thất bại!")
        );

        System.out.println(
                "- Login (\"dev_b\", \"sai_pass\"): " +
                        (UserManager.checkLogin("dev_b", "sai_pass") ? "Thành công!" : "Thất bại!")
        );
    }
}

