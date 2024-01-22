package model;

public class User {
    private int number ;
    private String username ;
    private String password ;
    private String phone ;

    public User(int number, String username, String password, String phone) {
        this.number = number;
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public int getNumber() {
        return number;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "number=" + number +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
