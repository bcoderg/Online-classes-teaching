import java.util.Random;

class TestcaseGenerator {
    public static void main(String[] args) {
        int n = 100000; // Maximum length of the string (10^5)
        System.out.println(n);

        Random rand = new Random();
        StringBuilder sb = new StringBuilder(n);

        // Generate a mix of random uppercase and lowercase letters
        for (int i = 0; i < n; i++) {
            char randomChar = (char) (rand.nextBoolean() ? ('A' + rand.nextInt(26)) : ('a' + rand.nextInt(26)));
            sb.append(randomChar);
        }

        System.out.println(sb.toString());
    }
}
