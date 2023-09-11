package org.example.user.entity;

import org.example.domain.member.User;
import org.example.domain.member.port.out.UserRegisterGateWay;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("unused")
interface UserRepository extends JpaRepository<UserEntity, Long>, UserRegisterGateWay{

    @Override
    default void save(final User user) {
        System.out.println("UserRepository.save");
        save(new UserEntity(user));
    }
}
