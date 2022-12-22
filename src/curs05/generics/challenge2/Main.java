package curs05.generics.challenge2;

public class Main {
    public static void main(String[] args) {
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);
        try{
            Pair<Running> pairOk = new Pair<>(runningShoe1, runningShoe2);
            System.out.println(pairOk);
        } catch (SizesDoNotMatchException | ColorsDoNotMatchException e){
            System.out.println(e.getMessage());
        }

        Boot bootShoe1 = new Boot("RED", 41);
//        Pair<Running> pairKO = new Pair<>(runningShoe1, bootShoe1); -> compile error

        Running runningShoe3 = new Running("RED", 42);
        Running runningShoe4 = new Running("BLACK", 42);

        try{
            Pair<Running> pairNo1 = new Pair<>(runningShoe1, runningShoe3);
            System.out.println(pairNo1);
        } catch (SizesDoNotMatchException | ColorsDoNotMatchException e){
            System.out.println(e.getMessage());
        }

        try{
            Pair<Running> pairNo2 = new Pair<>(runningShoe3, runningShoe4);
            System.out.println(pairNo2);
        } catch (SizesDoNotMatchException | ColorsDoNotMatchException e){
            System.out.println(e.getMessage());
        }




    }
}
