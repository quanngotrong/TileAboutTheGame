package tiles;

import gfx.Assets;
import javafx.scene.image.Image;

public class AchitectureMap1 extends Tile{
    public AchitectureMap1(int id) {
        super(Assets.map1[(id-1)%23][(id-1-((id-1)%23))/23], id);
    }

    @Override
    public boolean isSolid() {
        return false;
    }
}