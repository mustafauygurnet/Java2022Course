public class Main {
    public static void main(String[] args) throws Exception {
        String message = "The weather is very nice today!";

        System.out.println("Total Char Number: " + message.length());
        System.out.println("5. Char: " + message.charAt(4));
        System.out.println(message.concat(" Perfect!"));
        System.out.println(message.startsWith("The"));
        System.out.println(message.endsWith("today!"));

        char[] chars = new char[5];
        message.getChars(0, 3, chars, 0);
        System.out.println(chars);

        System.out.println(message.indexOf('h'));
        System.out.println(message.lastIndexOf('t'));

        System.out.println(message.replace(" ", "-"));
        System.out.println(message.substring(4, 11));

        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

    }
}
