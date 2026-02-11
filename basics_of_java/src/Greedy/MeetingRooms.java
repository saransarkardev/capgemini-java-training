package Greedy;


import java.util.Arrays;

public class MeetingRooms {
	static class Meeting{
        int start;
        int end;
        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static int maxMeetings(int[] start, int[] end) {
    
        int n = start.length;
        if (n == 0) return 0;

        Meeting[] meetings = new Meeting[n];

        for (int i=0; i<n; i++) {
            meetings[i] = new Meeting(start[i], end[i]);
        }

        // sort all the meeting paris by end time (ascending order)
        Arrays.sort(meetings, (a , b) -> Integer.compare(a.end, b.end));

        int count = 1;
        int lastEndTime = meetings[0].end;

        for (int i=1; i<n; i++) {
            if (meetings[i].start > lastEndTime) {
                count++;
                lastEndTime = meetings[i].end;
            }
        }

        return count;
    }
    public static void main(String[] args) {
		int[] start = {1, 3, 0, 5, 8, 5};
		int[] end = {2, 4, 6, 7, 9, 9};
		
		System.out.println(maxMeetings(start, end));
	}
}
