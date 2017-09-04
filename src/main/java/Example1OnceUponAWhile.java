import edu.illinois.cs.cs125.lib.zen.Zen;

/**
 * An example program written using Zen graphics.
 */
public class Example1OnceUponAWhile {

    /**
     * This program utilizes some of the additional Zen graphics capabilities.
     *
     * @param unused the arguments
     */
    public static void main(final String[] unused) {

        /*
         * Set a new font face. Then draw some text on the screen.
         */
        Zen.setFont("Times-50");
        Zen.drawText("Once", 0, 100);

        /*
         * Wait for a few milliseconds.
         */
        Zen.sleep(500);

        /*
         * Set a new color and then draw more text.
         *
         * @see https://en.wikipedia.org/wiki/RGB_color_model
         */
        Zen.setColor(255, 0, 0);
        Zen.drawText("Upon", 0, 200);

        /*
         * More text in a different color.
         */

        Zen.setColor(0, 0, 128);
        Zen.drawText("A Time (please click)", 0, 300);

        /*
         * Wait for a user click.
         */
        Zen.waitForClick();

        /*
         * Now produce a fade effect using a loop.
         */
        int shadeColor = 255;
        while (shadeColor > 0) {
            Zen.setColor(shadeColor, shadeColor, shadeColor);
            Zen.fillRect(0, 0, Zen.getZenWidth(), Zen.getZenHeight());
            Zen.sleep(1);
            shadeColor = shadeColor - 1;
        }

        /*
         * The end.
         */
        Zen.setColor(200, 200, 0);
        Zen.drawText("The end", 0, 200);
    }
}
