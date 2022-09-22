public class Main {
    public static void main(String[] args) throws Exception {
        String[][] cities = new String[3][3];


        cities[0][0] = "Istanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Ankara";
        cities[1][0] = "Mersin";
        cities[1][1] = "Konya";
        cities[1][2] = "Kayseri";
        cities[2][0] = "Gaziantep";
        cities[2][1] = "Diyarbakir";
        cities[2][2] = "Adana";

        for (int i = 0; i <= 2; i++) {
            System.out.println("-----------------------------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(cities[i][j]);
            }
        }

    }
}
