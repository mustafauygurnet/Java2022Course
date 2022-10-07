public class TeacherCreditManager implements CreditManagerImpl{

    @Override
    public void Calculate() {
        System.out.println("Teacher Credit Calculated");
    }

    @Override
    public void Save() {
        System.out.println("Teacher Credit saved");
    }
}
