class Average {
    public static void main(String[] args) {

        int a[] = {1,3,10,2,8};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        float average = (float)sum / a.length;
        System.out.println("平均 = " + average);
    }

}