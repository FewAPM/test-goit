package OOP;

import java.util.Objects;

public class EqualsUtil {

    private int x, y, z;

    @Override
    public boolean equals(Object o) { // порівнює об'єкти за значенням змінних (якщо Перший обєкт має x, y, z = 1 та Другий обєкт теж x, y, z = 1 ТО будуть вважитись рівними.
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsUtil point = (EqualsUtil) o;
        return x == point.x && y == point.y && z == point.z;
    }
    @Override
    public int hashCode() { // мій варіант
     return this.x + this.y + this.z;
    }

//    @Override  // Варіант автоперевірки
//    public int hashCode() {
//        return Objects.hash(x, y, z);
//    }
// r1=Rectangle {36, 72}, r2=Rectangle {36, 63}

    public static void main(String[] args) {
        int tA = 36;
        int tB = 72;
        int OtherA = 36;
        int OtherB = 63;



        boolean can = tA <= OtherA & tB <= OtherB;
        System.out.println(can);
    }



}
