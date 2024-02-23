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

    public static void isEquals(int o1, int o2) {
        if (o1 != o2) {
            System.out.println("Expected: " + o1);
            System.out.println("Result  : " + o2);
        } 
    }
}
