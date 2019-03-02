package creational.builder.Course.codeBuilder;

public class Pizza {
    private String dough;
    private String souce;
    private String topping;



    public Pizza() {

    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSouce(String souce) {
        this.souce = souce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", souce='" + souce + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}
