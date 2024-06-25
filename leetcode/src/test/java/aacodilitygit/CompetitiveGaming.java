package aacodilitygit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompetitiveGaming {

    public static void main(String[] args) {
        Integer[] numbers = {76,29,6,9,11,97,64,29,43,25,86,13,12,71,74,13,8,55,17,33,37,3,84,93,58,25,12,13,6,37,57,97,43,53,69,37,46,85,59,97,69,75,36,65,5,25,74,57,20,67,32,5,27,11,57,45,38,99,83,25,66,15,92,57,37,7,55,53,12,3,15,13,75,65,96,13,45,15,10,77,9,23,27,9,52,73,5,81,24,51,38,5,11,65,36,5,33,93,8,1,25,87,49,41,99,77,95,17,18,41,69,29,18,31,41,17,44,77,50,81,2,25,11,85,52,79,59,5,31,51,24,37,20,79,73,53,47,27,99,13,19,13,99,9,37,37,55,61,91,67,39,29,55,33,60,97,66,79,60,37,64,75,24,1,26,3,17,49,89,63,66,81,75,17,40,25,13,69,30,13,65,61,52,25,14,83,82,57,56,51,67,13,98,89,28,41,2,43,77,45,93,67,54,5,96,45,40,9,37,5,49,53,36,71,50,73,10,73,12,17,47,55,79,85,93,23,50,97,7,13,30,41,66,35,86,61,43,79,64,17,41,63,84,41,13,75,22,65,10,85,73,69,46,41,41,49,15,25,41,81,10,73,2,33,8,97,18,33,42,31,2,33,100,67,3,93,77,63,49,25,95,5,29,73,20,29,19,37,24,47,25,5,51,27,78,25,7,59,12,69,56,65,19,37,32,91,41,85,42,59,65,21,29,5,53,21,20,1,95,13,99,55,47,5,83,59,80,9,23,35,17,49,83,43,84,25,22,63,35,1,96,15,32,45,24,23,80,61,4,85,48,13,78,25,19,77,17,31,70,37,93,29,68,57,40,41,9,61,59,99,97,5,7,89,100,25,83,59,79,37,74,5,16,5,91,9,24,21,100,51,35,85,48,73,36,93,9,57,31,97,36,61,97,69,90,85,26,9,40,91,73,89,91,15,58,97,100,93,88,9,74,81,39,5,6,43,64,21,67,73,84,13,12,57,87,81,85,35,62,45,13,83,84,25,22,57,12,9,72,17,3,65,39,15,22,13,74,75,39,81,70,71,58,73,17,97,85,5,53,5,65,77,24,1,94,49,2,43,41,13,72,77,60,33,40,1,25,77,36,87,79,65,30,33,52,53,18,51,38,85,45,69,84,97,12,99,42,97,29,21,69,81,70,37,97,69,20,83,33,85,100,83,10,65,17,99,1,21,84,77,43,29,91,63,61,37,24,9,51,49,53,9,27,5,100,63,16,93,99,79,19,37,36,17,4,41,55,49,21,29,18,77,38,5,53,53,37,65,88,51,23,25,17,21,12,9,44,55,2,53,70,51,53,37,70,31,42,81,8,49,26,53,10,13,39,57,39,73,50,1,89,27,93,37,48,23,36,65,29,47,49,49,70,31,76,89,25,7,100,81,26,75,91,17,74,89,100,69,58,55,52,21,98,15,55,9,75,79,69,29,70,9,74,37,61,39,88,49,3,67,90,49,65,45,82,61,73,51,52,61,77,85,24,93,21,83,91,57,68,67,69,89,58,29,1,57,67,53,93,21,36,3,95,69,95,59,88,65,57,53,32,17,35,19,66,33,32,51,44,45,5,67,22,89,91,81,24,37,68,81,64,65,6,89,14,45,95,67,97,5,86,25,83,33,63,53,94,65,42,83,21,77,19,55,52,41,71,81,21,81,2,87,70,89,63,63,67,37,98,17,73,61,89,31,69,13,53,89,95,17,75,41,68,9,58,67,98,1,4,67,83,93,26,83,80,97,77,51,18,33,27,21,18,45,95,67,38,81,95,99,76,29,27,7,59,25,21,5,27,25,89,25,21,57,36,49,64,81,47,73,94,93,98,79,40,65,86,23,24,5,85,91,55,53,69,31,83,93,63,61,65,69,8,45,25,29,26,5,26,73,96,93,24,93,69,49,7,49,90,61,55,53,95,87,55,45,71,29,28,57,34,23,19,81,14,11,11,65,36,19,11,65,12,37,5,81,82,97,29,57,10,97,16,89,44,5,13,97,68,31,31,9,23,27,62,49,45,5,29,65,36,73,68,5,82,41,10,13,17,69,5,89,23,51,9,17,23,83,100,69,56,9,25,37,85,53,18,89,34,87,17,25,4,99,62,93,57,57,11,13,7,21,12,93,3,87,49,49,18,89,42,33,62,51,26,97,38,73,75,25,38,9,49,25,51,43,78,73,15,1,18,61,26,45,36,9,55,39,86,61,3,25,48,29,1,85,79,81,38,15,48,5,77,7,22,21,79,87,25,9};
        List<Integer> scores = Arrays.asList(numbers);
        int k = 710;
        System.out.println(numPlayers(k, scores));
    }




    public static int numPlayers(int k, List<Integer> scores) {
        int res = 0;
        Collections.sort(scores, Collections.reverseOrder());
        int[] positions = new int[scores.size()];
        int previousScore = scores.get(0);
        int previousPosition = 1;
        positions[0] = previousPosition;
        for(int i = 1; i < scores.size(); i++) {
            if (scores.get(i) == previousScore) {
                positions[i] = previousPosition;
            } else {
                previousPosition++;
                positions[i] = previousPosition;
            }
            previousScore = scores.get(i);
        }
        for (int p: positions) {
            if (p <= k)
                res++;
        }
        return res;
    }

}
