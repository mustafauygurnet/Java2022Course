public class Main {
    public static void main(String[] args) throws Exception {
        char[] wovels = new char[] { 'e', 'i', 'o', 'u', 'I' };
        char text = 'A';


        for (char c : wovels) {
            
            if (c == text) {
                System.out.println("This char is vowel");
                break;
            }else{
                System.out.println("This char is not vowel");
            }
        }

    }
}
