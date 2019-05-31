package fizzbuzz;


public class FizzBuzz {
    public String convert(int number) throws NonPositiveNumberException{

        if(isNegative(number)){
            throw new NonPositiveNumberException();
        }

        return buildFizzBuzz(number);
    }

    private String buildFizzBuzz (int number){
        String convertednumber = "";

        if (isMultipleOf3(number)){
            convertednumber += "fizz";
        }

        if (isMultipleOf5(number)){
            convertednumber += "buzz";
        }

        if (convertednumber.equals("")){
            return String.valueOf(number);
        }

        return convertednumber;
    }


    private boolean isNegative (int number){
        return number < 0;
    }

    private boolean isMultipleOf3(int number){
        return number % 3 == 0;
    }

    private boolean isMultipleOf5(int number){
        return number % 5 == 0;
    }


}
