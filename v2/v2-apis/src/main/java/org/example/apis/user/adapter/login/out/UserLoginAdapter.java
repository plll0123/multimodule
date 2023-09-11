package org.example.apis.user.adapter.login.out;

import org.example.apis.user.adapter.UserEntity;
import org.example.domain.user.model.User;
import org.example.domain.user.model.vo.LoginId;
import org.example.domain.user.port.login.in.UserLoginQuery;
import org.example.domain.user.port.login.out.UserLoginPort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserLoginAdapter extends UserLoginPort, JpaRepository<UserEntity, Long> {

    @Override
    default Optional<User> findByLoginId(final LoginId loginId) {
        return findByLoginId(loginId.loginId())
                .map(UserEntity::toDomain);
    }

    Optional<UserEntity> findByLoginId(final String loginId);
}
