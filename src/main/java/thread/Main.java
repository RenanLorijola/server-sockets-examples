package thread;

public class Main {
    public static void main(String[] args) {
            ThreadDemo td1 = new ThreadDemo("nome1");
            td1.start();
            ThreadDemo td2 = new ThreadDemo("nome2");
            td2.start();
            ThreadDemo td3 = new ThreadDemo("nome3");
            td3.start();
            ThreadDemo td4 = new ThreadDemo("nome4");
            td4.start();
    }
}
