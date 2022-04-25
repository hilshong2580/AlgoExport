import java.util.*;

/*
* Imagine that you want to schedule a meeting of a certain duration with a co-worker. YOu have access
* to your calendar and your co-worker's calendar (both of which contain your respective meetings for
* the day, in the form of [startTime, endTime]), as well as both of your daily bounds (i,e., the earliest
* and latest times at which you're available for meeting every day, in the form of [earliest, latestTime]).
*
* Write a function that takes in your calendar, your daily bounds, your co-worker's calendar,
* your co-worker's daily bounds, and the duration of the meeting that you want to schedule, a
* nd that returns a list of all the time blocks (in the form of [startTime, endTie]) during
* which you could schedule the meeting, ordered from earliest time block to latest.
*
* */
public class Arrays_CalendarMatching {
    public static List<StringMeeting> calendarMatching(
            List<StringMeeting> calendar1,
            StringMeeting dailyBounds1,
            List<StringMeeting> calendar2,
            StringMeeting dailyBounds2,
            int meetingDuration) {
        // Write your code here.
        List<Meeting> updateCal_1 = updateCal(calendar1, dailyBounds1);
        List<Meeting> updateCal_2 = updateCal(calendar2, dailyBounds2);
        List<Meeting> combineCal = combineCalendar(updateCal_1, updateCal_2);
        List<Meeting> overlap = overlapCalendar(combineCal);
        List<StringMeeting> able = ableCalendar(overlap, meetingDuration);

        //System.out.println(updateCal_1.get(0).end);

        return able;
    }

    public static List<StringMeeting> ableCalendar(List<Meeting> cal, int duration){
        List<StringMeeting> able = new ArrayList<StringMeeting>();
        System.out.println("ableCalendar");
        for(int i = 1; i<cal.size(); i++){
            if(cal.get(i).start - cal.get(i-1).end >=duration)
                able.add(new StringMeeting(minsToString(cal.get(i-1).end), minsToString(cal.get(i).start)));
        }
        return able;
    }

    public static String minsToString(int time){
        int mins = time % 60;
        int hrs = (time - mins) /60;
        String m;
        if(mins==0)
            m ="00";
        else if(mins < 10)
            m ="0"+String.valueOf(mins);
        else
            m =String.valueOf(mins);

        String combine = String.valueOf(hrs)+":"+m;

        return combine;
    }

    public static List<Meeting> overlapCalendar(List<Meeting> cal){
        List<Meeting> overlap = new ArrayList<Meeting>();
        //for(Meeting over: cal)
        //		System.out.println(over.start+" "+over.end);
        //System.out.println(" ");

        int i = 0;
        int startT = 0;
        int endT = 0;

        while (i < cal.size())
        {
            if(i==0)
            {
                startT = cal.get(i).start;
                endT = cal.get(i).end;
                i++;
            }

            if(endT >= cal.get(i).start)
            {

                if(endT > cal.get(i).end){
                    i++;
                }else {
                    endT = cal.get(i).end;
                    i++;
                }

                if(i >= cal.size())
                    overlap.add(new Meeting(startT, endT));

            }
            else{
                overlap.add(new Meeting(startT, endT));
                startT = cal.get(i).start;
                endT = cal.get(i).end;

            }

        }


        System.out.println(" overlapCalendar ");
        for(Meeting over: overlap)
            System.out.println(over.start+" "+over.end);
        System.out.println(" ");
        return overlap;
    }

    public static List<Meeting> combineCalendar(List<Meeting> cal_1, List<Meeting> cal_2){
        List<Meeting> combined = new ArrayList<Meeting>();
		/*
		System.out.println(" combineCalendar ");

		for(Meeting over: cal_1)
			System.out.print(over.start+" "+over.end+" | ");
		System.out.println(" ");

		for(Meeting over: cal_2)
			System.out.print(over.start+" "+over.end+" | ");
		System.out.println(" ");
		*/
        int i = 0, j = 0;

        while(i < cal_1.size() && j < cal_2.size()){
            if(cal_1.get(i).start == cal_2.get(j).start)
            {
                if(cal_1.get(i).end > cal_2.get(j).end)
                    combined.add(cal_1.get(i));
                else
                    combined.add(cal_2.get(j));
                i++;
                j++;
            }
            else if(cal_1.get(i).start < cal_2.get(j).start)
            {
                combined.add(cal_1.get(i));
                i++;
            }else
            {
                combined.add(cal_2.get(j));
                j++;
            }
        }

        System.out.println(" ");
        for(Meeting over: combined)
            System.out.print(over.start+" "+over.end+" | ");
        System.out.println(" ");
        System.out.println(" ");
        return combined;
    }

    public static List<Meeting> updateCal(List<StringMeeting> cal, StringMeeting bound){
        List<StringMeeting> calender = new ArrayList<StringMeeting>();
        calender.add(new StringMeeting("0:00", bound.start));
        calender.addAll(cal);
        calender.add(new StringMeeting(bound.end, "23:59"));

        List<Meeting> calMin = new ArrayList<Meeting>();
        for(StringMeeting temp: calender)
            calMin.add(new Meeting(StringToMins(temp.start), StringToMins(temp.end)));
        return calMin;
    }

    public static int StringToMins(String time){
        String[] arrOfStr = time.split(":", 0);
        int hour = Integer.parseInt(arrOfStr[0]);
        int mins = Integer.parseInt(arrOfStr[1]);
        return hour*60 + mins;
    }

    static class StringMeeting {
        public String start;
        public String end;

        public StringMeeting(String start, String end) {
            this.start = start;
            this.end = end;
        }
    }

    static class Meeting {
        public int start;
        public int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
