package SpaceShip;

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        int temp;
        String number = "";
        temp = count / 1000;
        if (temp > 0) {
            for (int i = 0; i < temp; i++) {
                number += "X";
            }
        }
        temp = count % 1000;
        temp = temp / 100;
        if (temp > 0) {
            for (int i = 0; i < temp; i++) {
                number += "Y";
            }
        }
        temp = count % 100;
        temp = temp / 10;
        if (temp > 0) {
            for (int i = 0; i < temp; i++) {
                number += "Z";
            }
        }
        temp = count % 10;
        temp = temp / 1;
        if (temp > 0) {
            for (int i = 0; i < temp; i++) {
                number += "*";
            }
        }
        return number;
    }
}