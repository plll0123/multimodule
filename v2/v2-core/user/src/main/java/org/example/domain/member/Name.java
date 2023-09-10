package org.example.domain.member;

import org.example.domain.DomainValueObject;
import org.example.domain.member.exception.UsernamePatternDoesntMatchException;

import java.util.regex.Pattern;

public class Name extends DomainValueObject {
    private final String name;
    private static final Pattern USER_NAME_PATTERN =
            Pattern.compile("^[가-힣]{2,5}$");

    public Name(final String name) {
        if (doesntMatch(USER_NAME_PATTERN, name)) {
            throw new UsernamePatternDoesntMatchException("회원 이름 양식에 맞지 않습니다.");
        }
        this.name = name;
    }

    public String name() {
        return name;
    }
}
