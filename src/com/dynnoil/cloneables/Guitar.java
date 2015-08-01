package com.dynnoil.cloneables;

/**
 * Created by leonid on 31.07.15.
 */
public class Guitar implements Cloneables {
    private int countStrings;
    private String color;

    public Guitar() {}

    public Guitar(int countStrings, String color) {
        this.color = color;
        this.countStrings = countStrings;
    }

    public Guitar toClone() {
        Guitar cloned = new Guitar();
        cloned.countStrings = this.countStrings;
        cloned.color = this.color;

        return cloned;
    }
}
