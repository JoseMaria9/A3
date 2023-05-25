public class Gachamiga {
    public static String cocinar(int i){
        if (i % 3 == 0 && i % 5 == 0) {
            return "Gachamiga";
        } else if (i % 3 == 0) {
            return "Gacha";
        } else if (i % 5 == 0) {
            return "Miga";
        } else {
            return Integer.toString(i);
        }
    }
}