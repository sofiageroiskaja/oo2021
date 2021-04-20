import java.util.*;

/**
 * Lijie
 * Just import the util. * Package
 */
public class tcs {

         // Initialize the map
    public static String[][] aa = new String[24][30];

         // Thread rest time, too fast, wireless output will be realized, the longer the snake eats, the faster it will be
    public static int seet = 100;

         // Record the snake's collection key, use him to add, separated by a number, two numbers, x and y coordinates
    public static LinkedList<String> dd = new LinkedList();

         // Specify a variable to accept the operation of the up and down mobile end of wsad
    public static String nana = "";

    // ****************************************************
    public static void main(String[] args) {
        tcs a = new tcs();
        a.load();
    }

         // The default loading event
    public void load() {
                 Info (); // Add map method
                 addList (); // Load the default location of the snake
                 print (); // The method of outputting map plus snake body
                 Random (); // randomly generate snake food
                 Random (); // Call a few times and there will be several foods on the field
        Random();
                 startUp (); // Start thread, start
    }

         // Create a mobile thread to start Greedy Snake
    public void startUp() {
                 Thread sd = new Thread (new move (), " ");
        sd.start();
        while (true) {
            Scanner input = new Scanner(System.in);
            nana = input.next();
                         // If there is more input, extract the first one
            if (nana.length() >= 2) {
                nana = nana.substring(0, 1);
            }
        }
    }

         // Implement thread movement class
    public class move implements Runnable {
        @Override
        public void run() {
            // TODO Auto-generated method stub
            while (true) {
                if (nana.equals("w")) {
                    w();
                } else if (nana.equals("s")) {
                    s();
                } else if (nana.equals("a")) {
                    a();
                } else if (nana.equals("d")) {
                    d();
                } else {
                                         // suspend the thread
                    Thread.yield();
                }
                try {
                                         // Minimum speed 80
                    if (seet < 80) {
                        seet = 80;
                    }
                    Thread.sleep(seet);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }


    // ******************************************************

         // The x coordinate of the snake body
    public int X(int x) {
        return Integer.parseInt(dd.get(x).split(",")[0]);
    }

         // The y coordinate of the snake body
    public int Y(int y) {
        return Integer.parseInt(dd.get(y).split(",")[1]);
    }

    /**
           * Add map method
     */
    public void Info() {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 30; j++) {
                if (i == 0) {
                    aa[i][j] = "■";
                }
                if (i == 23) {
                    aa[i][j] = "■";
                } else {
                    if (j == 0 || j == 29) {
                        aa[i][j] = "■";
                    } else {
                        if (i == 0) {

                        } else {
                            aa[i][j] = " ";
                        }
                    }
                }
            }
        }
                 // Until then, it was the default map ********************************
    }

         // Load the snake body and save it in the LinkedLis collection class. This collection is easy to add, delete and modify
    public void addList() {
        dd.add("16,14");
        dd.add("16,15");
        dd.add("16,16");
        dd.add("16,17");
    }

    /**
           * Console output method, output collection, including snake and map
           * Control the collection operation snake, turn the first one in the collection into the snake head and the snake tail
     */
    public void print() {
                 // Modify and add snake to cooperate with LinkedList
        for (int i = 0; i < dd.size(); i++) {
            int x = X(i);
            int y = Y(i);
            if (i == 0) {
                                 aa [x] [y] = "●"; // Snake Head ●
                continue;
            }
                         aa [x] [y] = "□"; // Body □
        }

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print(aa[i][j] + " ");
            }
            System.out.println();
        }

    }

         // Add food randomly
    public void Random() {
        int ii = (int) (Math.round(Math.random() * 20 + 2));
        int jj = (int) (Math.round(Math.random() * 26 + 2));
        if (ii == 0 || jj == 0 || ii == 23 || jj == 28) {
            Random();
        } else {
            for (int i = 0; i < dd.size(); i++) {
                int x = X(i);
                int y = Y(i);

                if (x == ii && jj == y) {
                    Random();
                } else {
                    aa[ii][jj] = "○";
                }
            }
        }

    }

         // Up move method
    public void w() {
                 // Add snake head to remove snake tail to achieve movement
        dd.addFirst(X(0) - 1 + "," + Y(0));
                 ss (); // Determine whether it hits the wall or your own body
                 if (aa [X (0)] [Y (0)]. equals ("○")) {// Determine if you have eaten food
            dd.addFirst(X(0) - 1 + "," + Y(0));
            Random();
            seet -= 15;
        }
        Remove();
    }

         // Next move method
    public void s() {
                 // Add snake head to remove snake tail to achieve movement
        dd.addFirst(X(0) + 1 + "," + Y(0));
                 ss (); // Determine whether it hits the wall or your own body
                 if (aa [X (0)] [Y (0)]. equals ("○")) {// Determine if you have eaten food
            dd.addFirst(X(0) + 1 + "," + Y(0));
            Random();
            seet -= 15;
        }
        Remove();
    }

         // Left move method
    public void a() {
                 // Add snake head to remove snake tail to achieve movement
        dd.addFirst(X(0) + "," + (Y(0) - 1));
                 ss (); // Determine whether it hits the wall or your own body
                 if (aa [X (0)] [Y (0)]. equals ("○")) {// Determine if you have eaten food
            dd.addFirst(X(0) + "," + (Y(0) - 1));
            Random();
            seet -= 15;
        }
        Remove();
    }

         // Right move method
    public void d() {
                 // Add snake head to remove snake tail to achieve movement
        dd.addFirst(X(0) + "," + (Y(0) + 1));
                 ss (); // Determine whether it hits the wall or your own body
                 if (aa [X (0)] [Y (0)]. equals ("○")) {// Determine if you have eaten food
            dd.addFirst(X(0) + "," + (Y(0) + 1));
            Random();
            seet -= 15;
        }
        Remove();
    }

         // Determine if it hits the wall or your own body
    public void ss() {
        if (aa[X(0)][Y(0)].equals("■")) {
                         System.out.println ("Cool");
            System.exit(0);
        }
        if (aa[X(0)][Y(0)].equals("□")) {
                         System.out.println ("Cool");
            System.exit(0);
        }
    }

         // Remove snake body and snake tail
    public void Remove() {
                 // Remove the snake, the last of aa ’s tail becomes "",
        aa[X(dd.size() - 1)][Y(dd.size() - 1)] = " ";
                 // remove the last one
        dd.removeLast();
                 // print snakes and maps
        print();
    }
}
