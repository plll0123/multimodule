package org.example.domain.avatar;

import org.example.domain.avatar.exception.NicknamePatternNotMatchesException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AvatarTest {

    @ParameterizedTest
    @ValueSource(strings = {"가", "가나다라마바", "a", "aaa", "가sk"})
    void createFail(final String source) {
        assertThrows(NicknamePatternNotMatchesException.class, () -> new Avatar(source));
    }

    @ParameterizedTest
    @ValueSource(strings = {"가나", "가나다라마"})
    void createSuccess(final String source) {
        assertDoesNotThrow(() -> new Avatar(source));
    }
}