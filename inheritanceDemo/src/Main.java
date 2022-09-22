public class Main {
    public static void main(String[] args) {

        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        FarmerCreditManager farmerCreditManager = new FarmerCreditManager();
        MilitaryCreditManager militaryCreditManager = new MilitaryCreditManager();

        //teacherCreditManager.Calc();
        //farmerCreditManager.Calc();

        CreditUI creditUI = new CreditUI();

        creditUI.CreditCalc(teacherCreditManager);
        creditUI.CreditCalc(farmerCreditManager);
        creditUI.CreditCalc(militaryCreditManager);

    }
}
