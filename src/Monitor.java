public class Monitor {
    private String resolution;
    private int size; // в дюймах

    Monitor(String resolution, int size) {
        this.resolution = resolution;
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Monitor: " + size + "\" " + resolution;
    }
}
