package map.hashmap;

import collection.Member;
import collection.hashset.MemberHashSet;

public class MemberHashTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박준서");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberSon);
        memberHashMap.addMember(memberPark);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1003);
        memberHashMap.showAllMember();

    }
}
