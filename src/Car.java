public class Car {

    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int productionYear;
    public String productionCountry;


    public Car(String brand, String model, Integer productionYear, String productionCountry, String color, Double engineVolume) {
        this.brand = ValidationUtils.validOrDefault(brand, "[ default ]");
        this.model = ValidationUtils.validOrDefault(model, "[ default ]");
        this.productionCountry = ValidationUtils.validOrDefault(productionCountry, "[ default ]");
        this.engineVolume = engineVolume > 0 ? engineVolume : 1.5;
        this.color = ValidationUtils.validOrDefault(color, "Белый");
        this.productionYear = productionYear >=0 ? productionYear : 2000;
        this.productionCountry = ValidationUtils.validOrDefault(productionCountry, "Россия");
    }

    @Override
    public String toString() {
        System.out.println("-----------------------------------------------------------");
        return brand + " " + model + ":\n" +
                "  - Год выпуска: " + productionYear + "\n" +
                "  - Сборка: " + productionCountry + "\n" +
                "  - Цвет кузова: " + color + "\n" +
                "  - Объем двигателя: " + engineVolume + " литра";
    }
}
