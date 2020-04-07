class SelectionSort {
    public static void main(String[] args) {

        int a[] = {10,3,1,4,2};

        for (int i = 0; i < a.length - 1; i++) {

            int min = a[i];
            int k = i;

            for (int j = i + 1; j < a.length; j++) {
                if (min > a[j]) {
                    min = a[j];
                    k = j;
                }
            }

            int tmp = a[i];
            a[i] = a[k];
            a[k] = tmp;
        }

        for (int i: a) {
            System.out.println(i);
        }
    }

}