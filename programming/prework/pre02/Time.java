public class Time{
  public static void main(String[] args){
    int hour;
    int minute;
    int second;
    hour = 20;
    minute = 12;
    second = 21;
    
    System.out.print("Seconds since midnight: ");
    double totSecs = (hour*60+minute)*60 + second;
    System.out.println(totSecs);
    System.out.print("Seconds remaining in the day: ");
    System.out.println(86400 - totSecs);
    System.out.print("Percentage of the day passed: ");
    System.out.println(totSecs/86400.0 * 100);
    
    //updated time
    minute = 20;
    second = 9;
    int secsElapsed = ((hour-20)*60 +minute - 12)*60 + second - 21;
    //System.out.print("Seconds elapsed: ");
    //System.out.println(secsElapsed);
    System.out.print("Time elapsed: ");
    System.out.println(secsElapsed/60/60 + ":"+ secsElapsed/60%60 + ":" + secsElapsed%60);
  }
}