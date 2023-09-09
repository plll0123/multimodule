package org.example.domain.avatar;

import org.example.domain.avatar.exception.NicknamePatternNotMatchesException;
import org.example.domain.member.DomainValueObject;

import java.util.regex.Pattern;

/**
 *
 */
public class Avatar extends DomainValueObject {

    private final Long id;
    private final String nickname;
    private static final Pattern NICKNAME_PATTERN =
            Pattern.compile("^[가-힣]{2,5}$");

    /**
     * 새로운 {@code Avatar} 인스턴스를 생성합니다.
     * 이 생성자는 새로운 회원 계정이 생성될 때 호출됩니다.
     *
     * @param nickname 다른 사용자에게 보여지는 이름입니다. 본명 대신 서비스에서 보여지는 이름으로 사용됩니다.
     *                 닉네임은 2~5글자의 한글로 구성되어야 합니다.
     * @throws NicknamePatternNotMatchesException 닉네임이 규칙에 맞지 않을 때 발생하는 예외입니다.
     */
    public Avatar(final String nickname) {
        if (doesntMatch(NICKNAME_PATTERN, nickname)) {
            throw new NicknamePatternNotMatchesException("닉네임 규칙에 맞지 않습니다.");
        }
        this.nickname = nickname;
        this.id = null;
    }

    public Long id() {
        return id;
    }

    public String nickname() {
        return nickname;
    }
}
