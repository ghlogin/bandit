package com.danisola.bandit.testframework.gui;

import java.awt.*;

public class Colors {

    private static Color[] colors = new Color[]{
        new Color(226, 107, 103),
        new Color(139, 187, 107),
        new Color(99, 156, 208),
        new Color(240, 169, 100),
        new Color(149, 112, 170),
        new Color(195, 119, 94),
        new Color(114, 114, 114),
        new Color(204, 139, 180)
    };

    public static Color getColor(Integer num) {
        return colors[num % colors.length];
    }

    public static String getRgbColor(Color color) {
        String rgb = Integer.toHexString(color.getRGB());
        return rgb.substring(2, rgb.length());
    }
}
