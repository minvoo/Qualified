package task3;

public class Soundbar extends Item {
    private Integer channels;
    private Boolean hasSubwoofer;

    public Soundbar(Integer id, Integer price, Integer channels, Boolean hasSubwoofer) {
        super(id, price);
        this.channels = channels;
        this.hasSubwoofer = hasSubwoofer;
    }

    public Integer getChannels() {
        return channels;
    }

    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    public Boolean getHasSubwoofer() {
        return hasSubwoofer;
    }

    public void setHasSubwoofer(Boolean hasSubwoofer) {
        this.hasSubwoofer = hasSubwoofer;
    }
}
