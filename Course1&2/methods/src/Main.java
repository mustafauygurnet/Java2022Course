public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber(){
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
            setMessage(find + " has been found");
        }else{
            setMessage(find + " has not been found");
        }
    }

    public static void setMessage(String message){
        System.out.println(message);
    }
}
