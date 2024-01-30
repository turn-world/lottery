package com.nefer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class UserRepository {

    private ArrayList<Member> memberList;

    public UserRepository() {
        this.memberList = new ArrayList<>();
    }

    public void add(Member member) {
        this.memberList.add(member);
    }

    public Member findByName(String name) {
        for (Member member : memberList) {
            if(member.getName().equals(name)) {
                return member;
            }
        }

        return null;
    }

}
