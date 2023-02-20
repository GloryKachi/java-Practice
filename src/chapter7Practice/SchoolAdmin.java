package chapter7Practice;

public class SchoolAdmin {
    private int[][] nativeScores = new int[2][5];
    private double[] averageScores = new double[2];

    public SchoolAdmin() {
    }

    public SchoolAdmin(int[][] scores) {
        nativeScores = scores;
    }

    public void setNativeScores(int[][] scores) {
        this.nativeScores = scores;
    }

    public double[] getAverageScore() {

        return averageScores;

    }


    public void setAverageScores(double[] averageScores) {
        this.averageScores = averageScores;
    }

    public int[][] getNativeScores() {
        return nativeScores;
    }

    public double[] calculateAverageScores() {
        int totalScore = 0;
        for (int counter = 0; counter < nativeScores.length; counter++) {
            for (int counter2 = 0; counter2 < nativeScores.length; counter2++) {
                totalScore += nativeScores[counter][counter2];
            }
            averageScores[counter] = totalScore / nativeScores.length;
        }
        return averageScores;
    }
}

