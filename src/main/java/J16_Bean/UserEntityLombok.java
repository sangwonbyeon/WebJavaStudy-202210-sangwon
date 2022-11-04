package J16_Bean;

import lombok.*;

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
@AllArgsConstructor //매개변수가 다 있는 것
@NoArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data  //위 4가지를 포함하는 것 , 필요한것만 쓴다고 하면 따로 쓴다.
public class UserEntityLombok {

    private String username;
    private String password;
    private String email;
    private String name;

}
