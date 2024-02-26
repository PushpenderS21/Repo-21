package feb20;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1001);
        arrayList.add(200);
        arrayList.add(350);
        arrayList.add(140);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(232);
        int temp;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i) > arrayList.get(j)) {
                    temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);

                }

            }

        }
        System.out.println(arrayList);
    }
}
