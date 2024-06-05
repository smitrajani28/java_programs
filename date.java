public class date {
    public static void main(String[] args) {
        System.out.println("milis   since 1970   :" +System.currentTimeMillis());
        System.out.println("seconds since 1970 :" +System.currentTimeMillis()/1000);
        System.out.println("minutes since 1970 :" +System.currentTimeMillis()/1000/60);
        System.out.println("hours   since 1970   :" +System.currentTimeMillis()/1000/3600);
        System.out.println("days    since 1970    :" +System.currentTimeMillis()/1000/3600/24);
        System.out.println("years   since 1970   :" +System.currentTimeMillis()/1000/3600/24/365);
        System.out.println("Long   :" +Long.MAX_VALUE + "  " +Long.MAX_VALUE/1000/3600/24/365);

    }
}
