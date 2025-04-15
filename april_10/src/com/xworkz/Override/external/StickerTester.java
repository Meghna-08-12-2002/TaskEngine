package com.xworkz.Override.external;

import com.xworkz.Override.internal.FancySticker;
import com.xworkz.Override.internal.Sticker;

public class StickerTester {
    public void testSticker(Sticker sticker) {
        if (sticker != null) {
            sticker.stick();
            if (sticker instanceof FancySticker) {
                FancySticker fancy = (FancySticker) sticker;
                fancy.reposition();
            } else {
                System.out.println("Not a fancy sticker");
            }
        } else {
            System.out.println("Sticker is null");
        }
    }
}
