
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int lastInd;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        this.lastInd=this.birdsPerDay.length-1;
    }

    public int[] getLastWeek() {
        //int[] a = new int[] {0, 2, 5, 3, 7, 8, 4};
        return this.birdsPerDay;
    }

    public int getToday() {
        if (this.lastInd<0) return 0;
        return this.birdsPerDay[this.lastInd];
    }

    public void incrementTodaysCount() {
        if (this.lastInd>-1)
        this.birdsPerDay[this.lastInd]+=1;
    }

    public boolean hasDayWithoutBirds() {
        for(int num_birds:this.birdsPerDay){
            if (num_birds==0){
                return true;
            }
        } return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum_=0;
        if (numberOfDays >this.lastInd) numberOfDays=this.lastInd+1; 
        for (int i =0; i<numberOfDays ; i++){
            sum_+=this.birdsPerDay[i];
        }
        return sum_;
    }

    public int getBusyDays() {
        int busyDays=0;
        for (int birds:this.birdsPerDay ){
            if (birds>4) busyDays+=1;
        }return busyDays;
    }
}
