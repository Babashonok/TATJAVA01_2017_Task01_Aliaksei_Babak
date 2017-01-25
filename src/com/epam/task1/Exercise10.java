package com.epam.task1;

/**
 * Form square matrix with even size according to the task
 */
public class Exercise10 {

    private int nSizes;
    private String notOddNumberOfSizes = "try to input odd size value";
    public Exercise10 (int nSizes) throws Exception {
        this.nSizes = nSizes;
        checkSize();
    }

    /**
     * check is size is even
     * @throws Exception if size is odd
     */
    private void checkSize() throws Exception {
        if (nSizes % 2 == 1) {
            throw new Exception(notOddNumberOfSizes);
        }
    }
    /**
     * print matrix to the console
     */
    public void printMatrix() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1 ; i <= nSizes ; i++ ) {
            stringBuilder.setLength(0);
            for (int j = 1 ; j <= nSizes ; j ++) {
                if (i % 2 == 1) {
                    stringBuilder.append(j).append(" ");
                }
                else {
                    stringBuilder.append((nSizes + 1 - j)).append(" ");
                }
            }
            System.out.println(stringBuilder);
        }
    }
}
