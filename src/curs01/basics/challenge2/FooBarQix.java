package curs01.basics.challenge2;

public class FooBarQix {
    public String compute(int n) {
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= n; i++){
            String checkDivisibilityResult = checkDivisibility(i);
            String checkContainsSpecificDigitsResult = checkContainsSpecificDigits(i);
            if (checkDivisibilityResult.isEmpty() && checkContainsSpecificDigitsResult.isEmpty()) {
                result.append(i);
            } else {
                result.append(checkDivisibilityResult).append(checkContainsSpecificDigitsResult);
            }
            result.append("\n");
        }
        return result.toString();
    }

    private String checkDivisibility(int x) {
        StringBuilder result = new StringBuilder();
        if(x % 3 == 0){
            result.append("Foo");
        }
        if(x % 5 == 0){
            result.append("Bar");
        }
        if(x % 7 == 0){
            result.append("Qix");
        }
        return result.toString();
    }

    private String checkContainsSpecificDigits(int x) {
        StringBuilder result = new StringBuilder();
        while(x > 0){
            switch (x % 10){
                case 3 -> result.append("Foo");
                case 5 -> result.append("Bar");
                case 7 -> result.append("Qix");
            }
            x /= 10;
        }
        return result.toString();
    }
}
