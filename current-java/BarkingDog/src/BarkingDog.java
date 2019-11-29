public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23 || !barking){
            return false;
        }
        return hourOfDay < 8 || hourOfDay > 22;
    }


}