package org.example.avatar;

import org.example.avatar.entity.AvatarEntity;
import org.springframework.data.repository.Repository;

public interface AvatarRepositotry extends Repository<AvatarEntity, Long> {

    AvatarEntity save(AvatarEntity avatar);
}
