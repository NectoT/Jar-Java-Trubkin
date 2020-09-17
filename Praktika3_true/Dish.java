package Praktika3_true;

public abstract class Dish {
    protected String material;
    private final String manufacturer;
    private double price = 0;
    private String quality;

    public Dish(String material, String manufacturer) {
        this.material = material;
        this.manufacturer = manufacturer;
        int qualityNum = (int)(Math.random() * 10) / 2;
        if (qualityNum == 5) {
            this.quality = "masterful";
        }
        else if (qualityNum == 4) {
            this.quality = "superiur";
        }
        else if (qualityNum == 3) {
            this.quality = "good";
        }
        else if (qualityNum == 2) {
            this.quality = "poor";
        }
        else if (qualityNum == 1) {
            this.quality = "crude";
        }
        else {
            this.quality = "okay";
        }
    }

    public Dish(String material, String manufacturer, double price) {
        this.price = price;
        this.material = material;
        this.manufacturer = manufacturer;
        int qualityNum = (int)(Math.random() * 10) / 2;
        if (qualityNum == 5) {
            this.quality = "masterful";
        }
        else if (qualityNum == 4) {
            this.quality = "superiur";
        }
        else if (qualityNum == 3) {
            this.quality = "good";
        }
        else if (qualityNum == 2) {
            this.quality = "poor";
        }
        else if (qualityNum == 1) {
            this.quality = "crude";
        }
        else {
            this.quality = "okay";
        }
    }

    public final String getManufacturer() {
        return manufacturer;
    }

    public final String getMaterial() {
        return material;
    }

    public final String getQuality() {
        return quality;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }

    public abstract String getDescription();

    public abstract void breakDish();

    public static void main(String[] args) {
        Fork fork = new Fork("China", 20);
        System.out.println(fork.getDescription());
        fork.breakDish();
        System.out.println(fork.getDescription());

        Bowl bowl = new Bowl("wood", "Germany", 100);
        System.out.println(bowl.getDescription());
        bowl.breakDish();
        System.out.println(bowl.getDescription());
    }

}

class Fork extends Dish {
    private int prongsAmount = 4;

    public Fork(String manufacturer) {
        super("metal", manufacturer);
    }

    public Fork(String manufacturer, double price) {
        super("metal", manufacturer, price);
    }

    public int getProngsAmount() {
        return prongsAmount;
    }

    @Override
    public void breakDish() {
        prongsAmount = prongsAmount > 0 ? prongsAmount - 1 : 0;
    }

    @Override
    public String getDescription() {
        return "This is a " + getQuality() + " fork produced by " + getManufacturer() + ".\n It has " + getProngsAmount() + " prongs";
    }
}

class Bowl extends Dish {
    private boolean broken = false;

    public Bowl(String material, String manufacturer) {
        super(material, manufacturer);
    }

    public Bowl(String material, String manufacturer, double price) {
        super(material, manufacturer, price);
    }

    @Override
    public void breakDish() {
        if (broken) {
            return;
        }
        material = "broken " + material;
        broken = true;
    }

    @Override
    public String getDescription() {
        return "This is a " + getQuality() + " bowl made out of " + getMaterial() + " and produced by " + getManufacturer();
    }
}