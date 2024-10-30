package kopo.poly.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserRole {

    // 권한 부여를 위한 enum 객체 생성 ( enum은 데이터 값을 정의할 때 사용되는 객체 )
    // 권한 변수명 정의 변수명은 내 마음대로 정의함

    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    private String value;

}
