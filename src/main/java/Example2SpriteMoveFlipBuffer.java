import java.io.File;

import edu.illinois.cs.cs125.lib.zen.Zen;

/**
 * Example program written using Zen Graphics.
 *
 * @see https://github.com/cs125-illinois/Zen
 * @see https://cs125-illinois.github.io/Zen/
 */

public class Example2SpriteMoveFlipBuffer {

    /**
     * This example shows how to use buffer swapping.
     *
     * Zen maintains two image buffers. The foreground buffer is currently displayed; the background
     * buffer is not. A complete image can be assembled unseen in the background buffer. The buffers
     * are then swapped and the image is then visible to the user.
     *
     * @param unused unused input parameters
     */
    public static void main(final String[] unused) {

        /*
         * The X coordinate of the image that we are going to draw.
         */
        int x = 100;
        /*
         * This loop will run until the user exits the program.
         */
        while (true) {
            /*
             * Draw the image into the background buffer at coordinates (x, 200).
             */
            ClassLoader classLoader = Example2SpriteMoveFlipBuffer.class.getClassLoader();
            File spriteFile = new File(classLoader.getResource("sprite1.gif").getFile());
            Zen.drawImage(spriteFile.getAbsolutePath(), x, 200);

            /*
             * Swap the background and foreground buffer, so our shifted image is now visible.
             */
            Zen.flipBuffer();

            /*
             * Sleep for 50 milliseconds.
             */
            Zen.sleep(50);

            /*
             * Shift the image right by 5 coordinate units.
             */
            x = x + 5;
        }
    }
}
