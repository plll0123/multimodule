package org.example.domain.avatar;

import org.example.domain.avatar.exception.NicknamePatternNotMatchesException;
import org.example.domain.member.DomainValueObject;

import java.util.regex.Pattern;

public class Avatar extends DomainValueObject {

    private final String nickname;
    private static final Pattern NICKNAME_PATTERN =
            Pattern.compile("^[가-힣]{2,5}$");

    public Avatar(String nickname) {
        if (validRegxp(NICKNAME_PATTERN, nickname)) {
            throw new NicknamePatternNotMatchesException("닉네임 규칙에 맞지 않습니다.");
        }
        this.nickname = nickname;
    }

    public String nickname() {
        return nickname;
    }
}
