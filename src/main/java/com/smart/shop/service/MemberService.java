package com.smart.shop.service;

import java.lang.reflect.Member;
import java.util.List;

/**
 * limit offset
 */
public interface MemberService {
    /**
     *
     * @param member
     * @param limit 起始
     * @param offset
     * @return
     */
    List<Member>  selecAll(Member member, int limit, int offset );
    int updateMember(MemberDto memberDto) {

        return
    }

}
