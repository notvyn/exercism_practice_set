
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        // Can also be 
        // int[] birdLastWeek = new int[] {0, 2, 5, 3, 7, 8, 4}
        int[] birdLastWeek = {0, 2, 5, 3, 7, 8, 4};

        return birdLastWeek;
    }

    public int getToday() {
        int birdsLen = this.birdsPerDay.length;
        return this.birdsPerDay[birdsLen - 1];  
    }

    public void incrementTodaysCount() {
        int birdsLen = this.birdsPerDay.length;
        this.birdsPerDay[birdsLen - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int day : this.birdsPerDay) {
            if (day == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < numberOfDays; i++) {
            if (i < this.birdsPerDay.length) {
                sum += this.birdsPerDay[i];
            }
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int day : this.birdsPerDay) {
            if (day >= 5) busyDays += 1;
        }
        return busyDays;
    }
}
