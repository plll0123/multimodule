package org.example.apis.user.adapter.persistence.register;

import org.example.apis.user.adapter.persistence.UserEntity;
import org.example.domain.user.model.User;
import org.example.domain.user.port.register.out.UserRegisterGateWay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegisterAdapter extends UserRegisterGateWay, JpaRepository<UserEntity, Long> {

    @Override
    default void save(User user) {
        save(new UserEntity(user));
    }
}
