package sandwich;

public class Sandwich {

    private String bread;
    private String lettuce;
    private String sausage;
    private String cheese;
    private String sauce;
    private String tomato;

    public Sandwich(String bread, String lettuce, String sausage, String tomato, String cheese, String sauce) {
        this.bread = bread;
        this.lettuce = lettuce;
        this.sausage = sausage;
        this.tomato = tomato;
        this.cheese = cheese;
        this.sauce = sauce;
    }

    public Sandwich() {
    }

    public Sandwich addBreed(String breed) {
        this.bread = breed;
        return this;
    }

    public Sandwich addLettuce(String lettuce) {
        this.lettuce = lettuce;
        return this;
    }

    public Sandwich addSausage(String sausage) {
        this.sausage = sausage;
        return this;
    }

    public Sandwich addCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public Sandwich addSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }
    public Sandwich addTotomato(String tomato) {
        this.tomato = tomato;
        return this;
    }

    public String getBread() {
        return bread;
    }
    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getLettuce() {
        return lettuce;
    }
    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }

    public String getSausage() {
        return sausage;
    }
    public void setSausage(String sausage) {
        this.sausage = sausage;
    }

    public String getCheese() {
        return cheese;
    }
    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getSauce() {
        return sauce;
    }
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getTotomato() {
        return tomato;
    }
    public void setTotomato(String tomato) {
        this.tomato = tomato;
    }

    public Sandwich build() {
        return new Sandwich(bread, lettuce, sausage, tomato, cheese, sauce);
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", lettuce='" + lettuce + '\'' +
                ", sausage='" + sausage + '\'' +
                ", cheese='" + cheese + '\'' +
                ", sauce='" + sauce + '\'' +
                ", tomato='" + tomato + '\'' +
                '}';
    }
}

