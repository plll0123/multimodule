package org.example.apis.user.adapter.register.out;

import org.example.apis.user.adapter.UserEntity;
import org.example.domain.user.model.User;
import org.example.domain.user.port.register.out.UserRegisterPort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegisterAdapter extends UserRegisterPort, JpaRepository<UserEntity, Long> {

    @Override
    default void save(User user) {
        save(new UserEntity(user));
    }
}
