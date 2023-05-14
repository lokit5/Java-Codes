package Oops;

public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Lokit";
        myAcc.setPassword("abcd");
        //we cannot access the password as it is private
    }
}
class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }

}

