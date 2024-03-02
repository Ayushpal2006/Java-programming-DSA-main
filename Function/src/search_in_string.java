public class search_in_string {
    public static void main(String[] args) {
        String s = "Ayush";
        char element = 'y';
        System.out.println(Search(s, element));
    }

    static String Search(String s, char element) {
        int m = s.length();
        System.out.println(m);
        for (int i = 0; i < m; i++) {
            if (element == s.charAt(i)) {
                System.out.println("alalalalalala");
            }
        }
        return "Not found";
    }
}
