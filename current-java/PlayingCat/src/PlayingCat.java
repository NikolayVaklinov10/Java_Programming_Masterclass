public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            if(temperature >= 25 && temperature <= 45){
                return true;
            }
            return false;
        }else if(!summer){
            if(temperature >= 25 && temperature <= 35){
                return true;
            }
            return false;
        }
        return false;
    }

    //OR MUCH BETTER
//    public class PlayingCat {
//        public static boolean isCatPlaying(boolean summer, int temperature) {
//            int lowerLimit = 25;
//            int upperLimit = summer ? 45 : 35;
//
//            if (temperature >= lowerLimit && temperature <= upperLimit) {
//                return true;
//            }
//            return false;
//        }
//    }
}
