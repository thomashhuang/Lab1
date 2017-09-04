import edu.illinois.cs.cs125.lib.zen.Zen;

/**
 * Example program written using Zen Graphics.
 *
 * @see https://github.com/cs125-illinois/Zen
 * @see https://cs125-illinois.github.io/Zen/
 */
public class Example6ReactionTimer {
    /**
     * This example tests your reaction time.
     *
     * @param unused unused input parameters
     */
    public static void main(final String[] unused) {

        /*
         * Initial box position and size.
         */
        int x = 100, y = 300;
        int width = 50, height = 50;

        while (Zen.isRunning()) {

            Zen.setColor(255, 255, 255);
            Zen.fillRect(x, y, width, height);
            long startTime = System.currentTimeMillis();

            /*
             * Wait for the user to mouse over the box.
             */
            while (true) {
                int mx = Zen.getMouseX();
                int my = Zen.getMouseY();
                if (mx >= x && mx < x + width && my >= y && my <= y + height) {
                    break;
                }
            }

            /*
             * Print the reaction time.
             */
            long stopTime = System.currentTimeMillis();
            long duration = stopTime - startTime;
            Zen.setColor(0, 0, 0);
            Zen.fillRect(0, 0, 640, 480);
            Zen.setColor(255, 0, 0);
            Zen.drawText("Time:" + duration, 100, 200);

            /*
             * Wait and then move the box.
             */
            Zen.sleep(1000);
            int oldX = x;
            x = 400 - y;
            y = oldX;
        }
    }
}
