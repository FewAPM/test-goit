package OOP;

import java.util.Arrays;

public class TargetFinder {

    public int getDistance(int x1, int y1, int x2, int y2){

        return (int) Math.sqrt((x2 - x1)*(x2 - x1) +(y2 - y1)*(y2 - y1));
    }

    public int[] findTarget(int[] aiCoords, int[][] targets){
        int minimum = getDistance(aiCoords[0], aiCoords[1], targets[0][0], targets[0][1]);
        boolean isTrue = false;
        int[] forReturn = {targets[0][0], targets[0][1]};
        while (!isTrue) {
            isTrue = true;
            for (int i = 0; i < targets.length; i++) {
                if (minimum > getDistance(aiCoords[0], aiCoords[1], targets[i][0], targets[i][1])) {
                    minimum = getDistance(aiCoords[0], aiCoords[1], targets[i][0], targets[i][1]);
                    isTrue = false;
                    forReturn[0] = targets[i][0];
                    forReturn[1] = targets[i][1];
                }
            }
        }

        return forReturn;
    }
}

class TestFinder{
    public static void main(String[] args) {
        int[] aiCoords = {48, 25};
        int[][] targets = { {48, 49},{48, 60},{48, 32},  {48, 35} };
        System.out.println(Arrays.toString(new TargetFinder().findTarget(aiCoords, targets)));
    }
}
