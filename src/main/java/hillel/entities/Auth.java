package hillel.entities;


import lombok.Data;

@Data
public class Auth {
    private String username;
        private String password;
    private String token;

    public Auth(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
