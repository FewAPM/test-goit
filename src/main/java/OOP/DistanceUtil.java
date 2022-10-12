package OOP;

public class DistanceUtil {


        private int x1;
        private int y1;
        private int x2;
        private int y2;

        public DistanceUtil(int startX, int startY, int endX, int endY){
            x1 = startX;
            y1 = startY;
            x2 = endX;
            y2 = endY;
        }
        public int getDistance(){
            return (int) Math.sqrt((x2 - x1)*(x2 - x1) +(y2 - y1)*(y2 - y1));
        }
    }

