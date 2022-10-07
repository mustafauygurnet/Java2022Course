public class MilitaryCreditManager implements CreditManagerImpl {

    @Override
    public void Calculate() {
        System.out.println("Military Credit Calculated");
    }

    @Override
    public void Save() {
        System.out.println("Military Credit saved");
    }
}
