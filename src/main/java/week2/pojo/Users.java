package week2.pojo;

import lombok.Data;

@Data
public class Users {
    private Long userId;
    private String role;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;

    public Users() {
    }
}
