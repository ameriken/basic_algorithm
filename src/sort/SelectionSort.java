package sort;

class SelectionSort {
    public static void main(String[] args) {

        int a[] = {10,3,1,4,2};

        for (int i = 0; i < a.length - 1; i++) {

            int tmp = a[i];
            int ins = 0;

            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > tmp) {
                    a[j + 1] = a[j];
                } else {
                    ins = j + 1;
                    break;
                }
            }
            a[ins] = tmp;
        }

        for (int i: a) {
            System.out.println(i);
        }
    }

}