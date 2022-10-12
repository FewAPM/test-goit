package moduleSix;

import java.util.Objects;

class QuarkeTrackUtil {
    private int sum;
    public int getSum(){
        return this.sum;
    }

    public QuarkeTrackUtil(int[] lines) {

        for (int i = 0; i < lines.length; i++) {
            this.sum += lines[i];
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        QuarkeTrackUtil other = (QuarkeTrackUtil) o;
        return this.sum == other.sum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.sum);
    }
}
class QuarkTest{
    public static void main(String[] args) {

        QuarkeTrackUtil q1 = new QuarkeTrackUtil(new int [] {36, 33});
        System.out.println("q1.getSum() = " + q1.getSum());
        QuarkeTrackUtil q2 = new QuarkeTrackUtil(new int [] {15, 40, 9, 2, 3});
        System.out.println("q2.getSum() = " + q2.getSum());
        System.out.println("q1.equals(q2) = " + q1.equals(q2));
    }
}
