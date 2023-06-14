package variousClassUsage.refactor;


import utility.generator.SequenceGenerator;
import variousClassUsage.refactor.RefactorManager;

public class RefactorVariousClassUsageTest {
    public static void main(String[] args) {
        // 추후 DB에서 보게 될 AutoIncrement 방식의 id 증가 패턴과 동일함
        //System.out.println(SequenceGenerator.getCurrentSequenceMemberId());
        //System.out.println(SequenceGenerator.getCurrentSequenceMemberId());

        RefactorManager manager2 = new RefactorManager();
        manager2.addRandomMember();
        manager2.printMemberList();

        manager2.addRandomProduct();
        manager2.printProductList();

        manager2.buyRandomProduct();
        manager2.printProductList();

        manager2.addMember();
        manager2.printMemberList();
    }
}
