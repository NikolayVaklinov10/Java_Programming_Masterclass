public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        boolean check = ((int)(firstNumber * 1000)== (int)(secondNumber * 1000));
        if(check){
            return true;
        }

        return false;
    }
}
