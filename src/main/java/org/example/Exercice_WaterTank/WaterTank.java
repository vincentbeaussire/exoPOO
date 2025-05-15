package org.example.Exercice_WaterTank;

public class WaterTank {
    private  int weightEmpty;
    private int maxCapacity;
    private int fillLevel;
    private static int totalFillLevel = 0;

    public WaterTank(int weightEmpty, int maxCapacity, int fillLevel) {
        this.weightEmpty = weightEmpty;
        this.maxCapacity = maxCapacity;
        this.fillLevel = fillLevel;
        totalFillLevel += fillLevel;
    }

    public WaterTank(int weightEmpty, int maxCapacity) {
        this.weightEmpty = weightEmpty;
        this.maxCapacity = maxCapacity;
        this.fillLevel = 0;
    }

    public static int getTotalFillLevel() {
        return totalFillLevel;
    }

    public void remplir(int qt) {
        if (this.fillLevel+qt > maxCapacity) {
            System.out.println("Erreur, cela va déborder");
        } else {
            this.fillLevel += qt;
            totalFillLevel += qt;
        }
    }

    public void vider(int qt) {
        if (this.fillLevel-qt < 0) {
            System.out.println("Erreur");
        } else {
            this.fillLevel -= qt;
            totalFillLevel -= qt;
        }
    }

    public int getWeightEmpty() {
        return weightEmpty;
    }

    public void setWeightEmpty(int weightEmpty) {
        this.weightEmpty = weightEmpty;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getFillLevel() {
        return fillLevel;
    }

    public void setFilllevel(int fillLevel) {
        this.fillLevel = fillLevel;
    }

    @Override
    public String toString() {
        return "WaterTank{" +
                "weightEmpty=" + weightEmpty +
                ", maxCapacity=" + maxCapacity +
                ", fillLevel=" + fillLevel +
                '}';
    }
}
