package BroCodeLessons;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskk {
    public static void main(String[] args) {

        Timer timer = new Timer();


        TimerTask task = new TimerTask() {
            int counter = 10;
//            @Override
            public void run() {
                if(counter > 1) {
                    System.out.println(counter + " seconds");
                    counter--;
                }
                else if(counter == 1){
                    System.out.println(counter + " second");
                    counter--;
                }
                else{
                    System.out.println("happy new year!");
                    timer.cancel();
                }
            }
        };
//        timer.schedule(task, 5000);
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2024);
        date.set(Calendar.MONTH, Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH, 31);
        date.set(Calendar.HOUR_OF_DAY, 13);
        date.set(Calendar.MINUTE, 59);
        date.set(Calendar.SECOND, 50);
        date.set(Calendar.MILLISECOND, 0);

//        timer.schedule(task, date.getTime());

//        timer.scheduleAtFixedRate(task, 0, 1000);
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);
    }
}
