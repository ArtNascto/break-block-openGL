package pong_game.game;

import pong_game.game.GameObject;
import java.util.ArrayList;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import pong_game.graphics.EventListener;

/**
 *
 * @author seishuku
 */
public class World {

    private static ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();

    public static void update() {

        for (GameObject go : gameObjects) {
            go.update();
        }
    }

    public static void render() {
        for (GameObject go : gameObjects) {
            go.render();
        }

    }

    public static void addObject(GameObject go) {
        gameObjects.add(go);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
