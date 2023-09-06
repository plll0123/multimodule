package org.example.member.domain;

public class Member {

    private final Long id;
    private final LoginId loginId;

    /**
     * 회원 도메인을 나타내는 클래스로 계정을 생성할 때 호출됩니다.
     * @param loginId 회원의 로그인 아이디
     */
    public Member(final String loginId) {
        this.id = null;
        this.loginId = new LoginId(loginId);
    }

    public Member(final Long id, final String loginId) {
        this.id = id;
        this.loginId = new LoginId(loginId);
    }
    public String loginId() {
        return loginId.loginId();
    }

    public Long id() {
        return id;
    }
}
