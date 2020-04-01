package assignment6;

import java.util.TreeSet;

public class Vampire {

    //Count number of digits in integer input
    public int countDigits(int num){
        int count = 0;
        int num_save = num;
        while(num > 0){
            num /= 10;
            count += 1;
        }
        return num_save != 0 ? count : 1;
    }

    //Initialize integer array input, to contain count of all digits present in the integer input
    public void counter(int num, int[] counter){
        int d;
        while(num > 0) {
            d = num % 10;
            counter[d] += 1;
            num /= 10;
        }
    }

    //Check if a given number and its factors, form a valid vampire number
    public boolean checkVampire(int product, int factor1, int factor2){
        int[] productCounter = new int[10];
        int[] factorCounter = new int[10];
        //Initialize counter array for product and factors
        counter(product, productCounter);
        counter(factor1, factorCounter);
        counter(factor2, factorCounter);
        //Check if both factors do not have trailing zeroes
        if(factor1 % 10 == 0 && factor2 % 10 == 0) return false;
        //Check if factors and number have the same digit count
        for(int index = 0; index <= 9; index++){
            if(productCounter[index] != factorCounter[index])
                return false;
        }
        return true;
    }

    //Print first 100 vampire numbers
    public void printVampires(){
        //Use TreeSet to store vampire numbers in sorted order
        TreeSet<Integer> vampires = new TreeSet<>();

        //Loop until TreeSet contains 100 vampire numbers
        for(int product = 1; vampires.size() < 100; product++){
            for(int factor1 = 1; factor1 <= Math.sqrt(product); factor1++){
                if(product % factor1 != 0) continue;
                int factor2 = product / factor1;
                int count = countDigits(product);
                if(count % 2 != 0) continue;
                int half = count/2;
                //Check if factors have exactly half the number of digits of product
                if(countDigits(factor1) != half && countDigits(factor2) != half) continue;
                //Check if valid vampire number
                if(checkVampire(product,factor1,factor2)){
                    vampires.add(product);
                    //Break if TreeSet has 100 number
                    if(vampires.size() == 100) break;
                }
            }
        }
        //Print first 100 vampire numbers
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

/**
 * Output:
 * 1. 1260
 *  2. 1395
 *  3. 1435
 *  4. 1530
 *  5. 1827
 *  6. 2187
 *  7. 6880
 *  8. 102510
 *  9. 104260
 *  10. 105210
 *  11. 105264
 *  12. 105750
 *  13. 108135
 *  14. 110758
 *  15. 115672
 *  16. 116725
 *  17. 117067
 *  18. 118440
 *  19. 120600
 *  20. 123354
 *  21. 124483
 *  22. 125248
 *  23. 125433
 *  24. 125460
 *  25. 125500
 *  26. 126027
 *  27. 126846
 *  28. 129640
 *  29. 129775
 *  30. 131242
 *  31. 132430
 *  32. 133245
 *  33. 134725
 *  34. 135828
 *  35. 135837
 *  36. 136525
 *  37. 136948
 *  38. 140350
 *  39. 145314
 *  40. 146137
 *  41. 146952
 *  42. 150300
 *  43. 152608
 *  44. 152685
 *  45. 153436
 *  46. 156240
 *  47. 156289
 *  48. 156915
 *  49. 162976
 *  50. 163944
 *  51. 172822
 *  52. 173250
 *  53. 174370
 *  54. 175329
 *  55. 180225
 *  56. 180297
 *  57. 182250
 *  58. 182650
 *  59. 186624
 *  60. 190260
 *  61. 192150
 *  62. 193257
 *  63. 193945
 *  64. 197725
 *  65. 201852
 *  66. 205785
 *  67. 211896
 *  68. 213466
 *  69. 215860
 *  70. 216733
 *  71. 217638
 *  72. 218488
 *  73. 226498
 *  74. 226872
 *  75. 229648
 *  76. 233896
 *  77. 241564
 *  78. 245182
 *  79. 251896
 *  80. 253750
 *  81. 254740
 *  82. 260338
 *  83. 262984
 *  84. 263074
 *  85. 284598
 *  86. 284760
 *  87. 286416
 *  88. 296320
 *  89. 304717
 *  90. 312475
 *  91. 312975
 *  92. 315594
 *  93. 315900
 *  94. 319059
 *  95. 319536
 *  96. 326452
 *  97. 329346
 *  98. 329656
 *  99. 336550
 *  100. 336960
 */