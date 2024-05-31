package com.pluralsight;

class Drink implements OrderItem {
    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public double getPrice() {
        double price = 0.0;

        // Base price based on drink size
        switch (size) {
            case "Small":
                price += 1.99;
                break;
            case "Medium":
                price += 2.49;
                break;
            case "Large":
                price += 2.99;
                break;
            default:
                // Default to the lowest price
                price += 1.99;
                break;
        }

        return price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return size + " " + flavor + " Drink";
    }
}

