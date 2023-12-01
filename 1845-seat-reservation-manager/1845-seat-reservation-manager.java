//priority queue instantiates a min-heap in java
//brute Force: take a boolean array for the seats
//optimized: can use priority queue
class SeatManager {
    private PriorityQueue<Integer> seats;
    public SeatManager(int n) {
        seats=new PriorityQueue<>();
        for(int i=1;i<=n;i++){
            seats.add(i);
        }
    }
    
    public int reserve() {
        return seats.poll();
    }
    
    public void unreserve(int seatNumber) {
        seats.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */