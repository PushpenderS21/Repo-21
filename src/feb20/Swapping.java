package feb20;

import java.util.ArrayList;

public class Swapping {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1001);
        arrayList.add(200);
        arrayList.add(350);
        arrayList.add(140);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(232);
        int temp;
        int x = arrayList.indexOf(200);
        int y = arrayList.indexOf(232);
        temp = arrayList.get(x);
        arrayList.set(x, arrayList.get(y));
        arrayList.set(y, temp);
        System.out.println(arrayList);


    }
}
