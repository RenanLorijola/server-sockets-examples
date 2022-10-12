package thread;

public class ThreadDemo extends Thread {

    private String nome;
    public ThreadDemo(String nome) {
        this.nome=nome;
    }

    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("teste thread: " + i + " " + this.nome);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {

        }

    }
}
