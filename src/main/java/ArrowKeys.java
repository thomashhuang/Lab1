import java.awt.event.KeyEvent;
import java.io.File;

import edu.illinois.cs.cs125.lib.zen.Zen;

/**
 * Example program written using Zen Graphics.
 *
 * @see https://github.com/cs125-illinois/Zen
 * @see https://cs125-illinois.github.io/Zen/
 */
public class ArrowKeys {
    /**
     * This example shows how to receive arrow key presses.
     *
     * @param unused unused input parameters
     */
    public static void main(final String[] unused) {

        Zen.create(320, 200, "stretch");
        int x = 100, y = 100;

        ClassLoader classLoader = SpriteMoveFlipBuffer.class.getClassLoader();
        File spriteFile = new File(classLoader.getResource("sprite1.gif").getFile());

        while (Zen.isRunning()) {
            if (y > 0 && Zen.isVirtualKeyPressed(KeyEvent.VK_UP)) {
                y = y - 4;
            }
            if (y < Zen.getZenHeight() - 32 && Zen.isVirtualKeyPressed(KeyEvent.VK_DOWN)) {
                y = y + 4;
            }
            if (x > 0 && Zen.isVirtualKeyPressed(KeyEvent.VK_LEFT)) {
                x = x - 4;
            }
            if (x < Zen.getZenWidth() - 32 && Zen.isVirtualKeyPressed(KeyEvent.VK_RIGHT)) {
                x = x + 4;
            }
            Zen.drawImage(spriteFile.getAbsolutePath(), x, y);
            Zen.flipBuffer();
            Zen.sleep(8);
        }
    }

}
