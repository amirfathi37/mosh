public class Employee {
    private String name;
    private Byte hourRang;


    public Employee(String name) {
        this(name , (byte) 1);
    }

    public Employee(String name, byte hourRang) {
        setName(name);
        setHourRang(hourRang);
        System.out.println();
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.equals(""))
            throw new IllegalArgumentException("cant set empty value on name");
        this.name = name;
    }

    public byte getHourRang() {
        return hourRang;
    }

    private void setHourRang(byte hourRang) {
        if (hourRang == 0)
            throw new IllegalArgumentException("cant set 0 value on hourRange");
        this.hourRang = hourRang;
    }
}
