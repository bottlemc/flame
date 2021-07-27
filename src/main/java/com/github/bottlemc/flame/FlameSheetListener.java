package com.github.bottlemc.flame;

import com.github.bottlemc.sheet.Sheet;
import com.github.glassmc.loader.GlassLoader;
import com.github.glassmc.loader.Listener;

public class FlameSheetListener implements Listener {

    @Override
    public void run() {
        GlassLoader.getInstance().getAPI(Sheet.class).registerType("flame", FlameConfiguration.class);
    }

}
