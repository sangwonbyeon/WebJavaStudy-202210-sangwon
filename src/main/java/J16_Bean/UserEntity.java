package J16_Bean;
/*
정보를 담는 객체를 Entity Class라 한다.
UsersEntity => User 의 정보를 담는 객체
정보를 담는 객체라 getter, setter가 필요하다.

1. 멤버변수 선언
2. 생성자 정의
3. Getters and setters 정의
4. Equals and HashCode 정의
5. toString 정의
6.
 */
public class UserEntity {

    private String username;
    private String password;
    private String email;
    private String name;

    public UserEntity(){}

    public UserEntity(String username, String password, String email, String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
