public class Main {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[] {1,2,5,7,9,0};
        int find = 5;

        boolean isFind = false;

        for (int number : numbers) {
            if (number == find) {
                isFind = true;
                break;
            }
        }

        if(isFind){
            System.out.println(find + " has been found");
        }else{
            System.out.println(find + " has not been found"); 
        }
    }
}
