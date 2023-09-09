package org.example.domain.member;

import org.example.domain.member.exception.UsernamePatternDoesntMatchException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @ParameterizedTest
    @ValueSource(strings = {"엄", "david", "이름이여섯자"})
    void createFail(final String username) {
        assertThrows(UsernamePatternDoesntMatchException.class, () -> new User(username, nickname()));
    }

    @ParameterizedTest
    @ValueSource(strings = {"엄준식", "최대쌍녀"})
    void createSuccess(final String username) {
        assertDoesNotThrow(() -> new User(username, nickname()));
    }
    /**
     * 닉네임에 대한 테스트 의존성을 줄이기 위한 메서드입니다.
     * @return 닉네임 생성 이벤트에 대해 항상 생성하는 반환 값
     */
    String nickname() {
        return "성공";
    }
//    static Avatar createAvatar() {
//        class MockAvatar extends Avatar {
//            public MockAvatar() {
//                super("성공");
//            }
//        }
//        return new MockAvatar();
//    }
}