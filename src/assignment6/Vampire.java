package assignment6;

import java.util.TreeSet;

public class Vampire {

    public int countDigits(int num){
        int count = 0;
        int num_save = num;
        while(num > 0){
            num /= 10;
            count += 1;
        }
        return num_save != 0 ? count : 1;
    }

    public void counter(int num, int[] counter){
        int d;
        while(num > 0) {
            d = num % 10;
            counter[d] += 1;
            num /= 10;
        }
    }

    public boolean checkVampire(int product, int factor1, int factor2){
        int[] productCounter = new int[10];
        int[] factorCounter = new int[10];
        counter(product, productCounter);
        counter(factor1, factorCounter);
        counter(factor2, factorCounter);
        if(factor1 % 10 == 0 && factor2 % 10 == 0) return false;
        for(int index = 0; index <= 9; index++){
            if(productCounter[index] != factorCounter[index])
                return false;
        }
        return true;
    }

    public void printVampires(){
        TreeSet<Integer> vampires = new TreeSet<>();
        for(int product = 1; vampires.size() < 100; product++){
            for(int factor1 = 1; factor1 <= Math.sqrt(product); factor1++){
                if(product % factor1 != 0) continue;
                int factor2 = product / factor1;
                int count = countDigits(product);
                if(count % 2 != 0) continue;
                int half = count/2;
                if(countDigits(factor1) != half && countDigits(factor2) != half) continue;
                if(checkVampire(product,factor1,factor2)){
                    vampires.add(product);
                    if(vampires.size() == 100) break;
                }
            }
        }
        int i = 1;
        for(int vampire: vampires){
            System.out.println(i + ". " + vampire);
            i += 1;
        }
    }


    public static void main(String[] args) {
        Vampire vampire = new Vampire();
        vampire.printVampires();
    }
}
