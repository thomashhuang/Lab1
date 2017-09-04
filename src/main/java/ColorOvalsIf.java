import edu.illinois.cs.cs125.lib.zen.Zen;

/**
 * Example program written using Zen Graphics.
 *
 * @see https://github.com/cs125-illinois/Zen
 * @see https://cs125-illinois.github.io/Zen/
 */
public class ColorOvalsIf {
   /**
     * This example draws beautiful ovals in happy joyous colors.
     *
     * @param unused unused input parameters
     */
    public static void main(final String[] unused) {

        /*
         * If the user exits the loop, shut down.
         */
        while (Zen.isRunning()) {

            /*
             * Wait for a mouse click.
             */
            Zen.waitForClick();

            /*
             * Get the click location and use it to set the oval location and color.
             */
            int x = Zen.getMouseX();
            int y = Zen.getMouseY();

            Zen.fillOval(x - 16, y - 16, 32, 32);
            Zen.setColor(x, y, x + y);
        }
    }
}
