package timBuchanka;

public class CarChallenge {
    private  int accoutnNumber;
    private  int balance;
    private  String customerName;
    private  String  email;
    private  String phoneNumber;

    public int getAccoutnNumber() {
        return accoutnNumber;
    }

    public void setAccoutnNumber(int accoutnNumber) {
        this.accoutnNumber = accoutnNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
public void deposit (int depositAmount){
        balance = depositAmount;

}


}
