package collection;

import java.util.*;

public class Member2 implements Comparator<Member2> {
    private int memberId;
    private String memberName;

    public Member2(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }



    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + " 입니다.";
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.memberId == member.getMemberId()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int compare(Member2 member1, Member2 member2) {
        return member1.getMemberId() - member2.getMemberId();
    }
}
