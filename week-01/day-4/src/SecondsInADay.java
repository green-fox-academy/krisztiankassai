public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int secondsInaDay = 86400;
        int answer = ((secondsInaDay) - (currentHours * 60 *60) - (currentMinutes * 60) - currentSeconds);

        System.out.println(answer);

    }
}
