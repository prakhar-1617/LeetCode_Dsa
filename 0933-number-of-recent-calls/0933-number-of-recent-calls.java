class RecentCounter {
    ArrayList<Integer> arr;

    public RecentCounter() {
        arr = new ArrayList<>();
    }

    public int ping(int t) {
        arr.add(t); 
  int start = t - 3000;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= start && arr.get(i) <= t) {
                count++;
            }
        }
        return count;
    }
}