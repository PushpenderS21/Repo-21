package feb11;

class Members {
    String community;
    String nameOfMember;
    int age;

    public Members(String nameOfMember, int age) {
        this.nameOfMember = nameOfMember;
        this.age = age;
        System.out.println("our community is :faith");
    }

    public void goal() {
        System.out.println("our mission is peace");
    }

    {
        System.out.println("we believe in god");
    }


}

class MoreMembers extends Members {
    public MoreMembers(String nameOfMember, int age) {
        super(nameOfMember, age);
    }

    {
        System.out.println("We have different mission");
    }
}


public class InstanceBlock {
    public static void main(String[] args) {
        MoreMembers member1 = new MoreMembers("john", 56);
        MoreMembers member2 = new MoreMembers("Kayla", 60);
       /* System.out.println(member1.nameOfMember);
        System.out.println(member1.age);
        System.out.println(member2.nameOfMember);
        System.out.println(member2.age);
        member1.goal();*/
    }
}
