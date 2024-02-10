public class Assert {
    
    public static boolean isTrue(boolean tOrF) {
        if (!tOrF) {
            System.out.println("Expected: " + true);
            System.out.println("Result  : " + tOrF);
        }
        return tOrF;
    }
}
