package com.pluralsight;

class Chips implements OrderItem {
    private String type;

    public Chips(String type) {
        this.type = type;
    }

    public double getPrice() {
        double price = 0.0;

        // Base price based on chip type
        switch (type) {
            case "Regular":
                price += 1.99;
                break;
            case "Barbecue":
                price += 2.49;
                break;
            case "Sour Cream & Onion":
                price += 2.49;
                break;
            default:
                // Default to the lowest price
                price += 1.99;
                break;
        }

        return price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " Chips";
    }
}
