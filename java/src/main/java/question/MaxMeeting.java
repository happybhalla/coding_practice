package question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Meeting {
    int start;
    int end;
    int pos;

    public Meeting(int start, int end, int pos) {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

class MeetingComparator implements Comparator<Meeting> {
    @Override
    public int compare(Meeting o1, Meeting o2) {
        return o1.end - o2.end;
//        if (o1.end < o2.end) {
//            return -1;
//        } else if (o1.end > o2.end) {
//            return 1;
//        } else return 0;
    }
}

public class MaxMeeting {

    public static void getMaxMeeting(ArrayList<Meeting> meetingArrayList) {
        MeetingComparator mc = new MeetingComparator();
        Collections.sort(meetingArrayList, mc);
        List<Integer> res = new ArrayList<>();
        res.add(meetingArrayList.get(0).pos);
        int endTime = meetingArrayList.get(0).end;
        for (int i = 1; i < meetingArrayList.size(); i++) {
            if (endTime < meetingArrayList.get(i).start) {
                res.add(meetingArrayList.get(i).pos);
                endTime = meetingArrayList.get(i).end;
            }
        }

        for (Integer m : res) {
            System.out.println(m.toString());
        }
    }

    public static void main(String[] args) {
        int s[] = {1, 3, 0, 5, 8, 5};

        // Finish time
        int f[] = {2, 4, 6, 7, 9, 9};


        ArrayList<Meeting> meetingsList = new ArrayList<Meeting>();

        for (int i = 0; i < s.length; i++) {
            meetingsList.add(new Meeting(s[i], f[i], i));
        }
        getMaxMeeting(meetingsList);
    }
}
