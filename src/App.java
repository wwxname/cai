
public class App {
    public static void main(final String[] args) {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                int i = 0;
                // TODO Auto-generated method stub
                while (true) {
                    try {
                
                        Thread.sleep(3000);
                        i++;
                        System.err.println(
                             i
                        );
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                
            }
        });
        t1.setName("wwx");
        // t1.start();

        try {
            Thread.sleep(3000000);
        } catch (final InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
} 