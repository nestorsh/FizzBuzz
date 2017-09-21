import static java.lang.String.valueOf;

public class FizzBuzz {

    public String get(int position){
        return isMultipleOfFifteen(position) ? "FizzBuzz" :
                isMultipleOfThree(position) ? "Fizz" :
                        isMultipleOfFive(position) ? "Buzz" :
                                valueOf(position);

    }

    private boolean isMultipleOfThree(int position){
        return isMutipleOfFactor(position,3);
    }

    private boolean isMultipleOfFifteen(int position) {
        return isMutipleOfFactor(position,15);
    }
    private boolean isMultipleOfFive(int position) {
        return isMutipleOfFactor(position,5);
    }

    private boolean isMutipleOfFactor(int position, int factor){
        return position%factor==0;
    }
}
