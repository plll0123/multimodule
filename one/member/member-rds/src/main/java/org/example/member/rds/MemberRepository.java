package org.example.member.rds;

import org.example.member.domain.Member;
import org.springframework.data.repository.Repository;

public interface MemberRepository extends Repository<Long, MemberEntity> {

    MemberEntity save(final Member member);
}
