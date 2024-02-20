package homework8;

public class Int {
    private int[] a;

    public Int(int[] a) {
        this.a = a;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    //1
    public int toMin() {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    //2
    public int getSecondLargest() {
        int secondMax = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > secondMax) {
                secondMax = a[i - 1];
            }
        }
        return secondMax;
    }

    public int toSum() {
        int min = a[0];
        int max = a[0];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        sum = max + min;
        return sum;
    }

}
