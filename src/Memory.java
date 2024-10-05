public class Memory {
    private String type; // Тип памяти (DDR4, DDR5)
    private int size; // в ГБ

    public Memory(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Memory: " + size + "GB " + type;
    }
}
