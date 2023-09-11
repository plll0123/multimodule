package org.example.domain.user.model.vo;

import org.example.domain.user.exception.UsernamePatternDoesntMatchException;

import java.util.regex.Pattern;

public class Name {
    private final String name;
    private static final Pattern USER_NAME_PATTERN =
            Pattern.compile("^[가-힣]{2,5}$");

    public Name(final String name) {
        if (USER_NAME_PATTERN.matcher(name).matches()) {
            throw new UsernamePatternDoesntMatchException("");
        }
        this.name = name;
    }

    /**
     * 이미 존재하는 엔티티를 검색하여 찾아오는 경우 호출되는 메서드입니다.
     * 아이디 양식에 대한 검증을 마친 아이디기에 추가적인 검증이 필요하지 않습니다.
     * @param name 저장된 회원의 이름
     * @return 저장된 Name 객체
     */
    public static Name of(final String name) {
        return new Name(name);
    }

    public String name() {
        return name;
    }
}
