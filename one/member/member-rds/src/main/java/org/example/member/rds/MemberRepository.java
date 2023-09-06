package org.example.member.rds;

import org.example.member.domain.Member;
import org.example.member.rds.entity.MemberEntity;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface MemberRepository extends Repository<MemberEntity, Long> {

    MemberEntity save(final MemberEntity member);

    Optional<MemberEntity> findById(final Long id);
}
