package com.github.bottlemc.flame;

import com.github.bottlemc.sheet.Sheet;
import com.github.glassmc.loader.GlassLoader;
import com.github.glassmc.loader.Listener;

public class FlameInitializeListener implements Listener {

    @Override
    public void run() {
        GlassLoader glassLoader = GlassLoader.getInstance();
        glassLoader.registerAPI(new Flame(glassLoader.getAPI(Sheet.class).load("flame")));

        System.out.println(GlassLoader.getInstance().getAPI(Flame.class).getConfiguration());
    }

}
