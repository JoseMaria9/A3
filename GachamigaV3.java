public class Gachamigav2 {
    public String cocinar (int n) {
            if (n % 3 == 0 && n % 5 == 0) {
                return "Gachamiga";
            } else if (n % 3 == 0) {
                return "Gacha";
            } else if (n % 5 == 0) {
                return "Miga";
            } else {
                return "" + n;
            }
    }
}