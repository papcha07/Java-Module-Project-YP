public class Formatter {


    public static String getEnding(float cost) {

        int roundAmount = (int) Math.floor(cost);

        if (roundAmount % 100 >= 11 && roundAmount % 100 <= 19) {
            return "рублей";
        }

        int lastDig = roundAmount % 10;

        switch (lastDig) {
            case 1:
                return "рубль";
            case 2:
            case 3:
            case 4:
                return "рубля";
            default:
                return "рублей";
        }


    }


}
