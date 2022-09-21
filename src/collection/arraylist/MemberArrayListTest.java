package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "홍길동");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberPark);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberLee.getMemberId());
        memberArrayList.showAllMember();
    }
}
