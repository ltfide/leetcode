public class Assert {

    private static void print(boolean tOrF) {
        System.out.println("Expected: " + !tOrF);
        System.out.println("Result  : " + tOrF);
    }
    
    public static boolean isTrue(boolean tOrF) {
        if (!tOrF) {
            print(tOrF);
        }
        return tOrF;
    }

    public static boolean isFalse(boolean tOrF) {
        if (tOrF) {
            print(tOrF);
        }
        return !tOrF;
    }
}
