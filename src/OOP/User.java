package OOP;

public class User {
    private String userName;
    private String password;

    public User(String userName, String password){
        this.userName=userName;
        this.password=password;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public void setUserName(String newUserName) {
        if (newUserName.length() >= 4) {
            this.userName = newUserName;
        }

    }

}
