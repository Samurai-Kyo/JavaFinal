public class Card {
    public int value;
    public String name;

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println("NAME: " + getName() + ", VALUE: " + getValue());
    }
}
