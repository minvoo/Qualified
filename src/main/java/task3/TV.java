package task3;


import task3.enums.ScreenType;

public class TV extends Item {
    private Integer size;
    private ScreenType screenType;
    private Integer resolution;

    public TV(Integer id, Integer price, Integer size, ScreenType screenType, Integer resolution) {
        super(id, price);
        this.size = size;
        this.screenType = screenType;
        this.resolution = resolution;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public void setScreenType(ScreenType screenType) {
        this.screenType = screenType;
    }

    public Integer getResolution() {
        return resolution;
    }

    public void setResolution(Integer resolution) {
        this.resolution = resolution;
    }
}
