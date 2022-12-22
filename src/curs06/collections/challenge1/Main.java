package curs06.collections.challenge1;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        getLeaders(List.of(11, 2, 3, 7, 2, 3, 5, 4, 2, 3, 1, 2));
    }

    public static void getLeaders(List<Integer> list){
        if(list.size() == 0){
            System.out.println("In empty list can not exist leaders!");
            return;
        }
        int leader = list.get(list.size() - 1);
        System.out.println(leader);
        for(int i = list.size() - 2; i >= 0; i--){
            if(list.get(i) > leader){
                leader = list.get(i);
                System.out.println(leader);
            }
        }
    }
}
