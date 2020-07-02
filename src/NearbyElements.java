package src;

public class NearbyElements {
    public static int[][] multi = new int[][] { { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 }, { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 } };

    static int[] nearby(int x, int y, int range) {
        int[] elements = new int[range * 2];
        int rowLen = multi[x].length;
        int forward = 1, back = 1;
        int rightDiff = 0, leftDiff = 0;

        for (int i = 0; i < range; i++) {
            /*
             * System.out.println("i: " + i + "\nfwd: " + forward + "\nback: " + back);
             * System.out.println("rowlen: " + rowLen);
             */
            if (y + forward < rowLen) {
                elements[(range - 1) + forward] = multi[x][y + forward];
                forward++;
            } else {
                // crop everything from the pivot onwards
                rightDiff++;
            }
            if (y - back >= 0) {
                elements[range - back] = multi[x][y - back];
                back++;
            } else {
                leftDiff++;
            }
        }
        // System.out.println(String.format("Right diff: %d\nLeft Diff: %d", rightDiff,
        // leftDiff));

        // crop everything from the pivot backwards
        int[] newElements = new int[elements.length - (rightDiff + leftDiff)];
        for (int i = 0; i < newElements.length; i++) {
            newElements[i] = elements[leftDiff + i];
        }

        return newElements;
    }
}