package cleancode;

public class kelasPengguna {
    private String username;
    private String password;

    public kelasPengguna(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void storeUserInformation(String username, String password) {
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}