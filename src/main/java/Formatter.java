public class Formatter {

    public float cost;

    public String getEnding(float cost){

        int wholePart = (int)cost;

        if(wholePart % 10 == 1 && (wholePart % 11 != 11)){
            return "рублей";
        }
        else if (wholePart %10 >= 2 && wholePart%10 <= 4){
            return "рубля";
        }
        else{
            return "рублей";
        }

    }


}
