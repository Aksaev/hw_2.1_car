public class Car {

    public String brand;
    public String model;
    public Integer productionYear;
    public String productionCountry;
    public String color;
    public Double engineVolume;

    public Car(String brand, String model, Integer productionYear, String productionCountry, String color, Double engineVolume) {

        // Если не указана модель
        if ((brand == null || brand.length() == 0)) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        // Если не указана марка
        if ((model == null || model.length() == 0)) {
            this.model = "default";
        } else {
            this.model = model;
        }

        // Если не указана страна сборки
        if ((productionCountry == null || productionCountry.length() == 0)) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        // Если не указан объем двигателя
        if (engineVolume == null) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        // Если не указан цвет
        if (color == null || color.length() == 0) {
            this.color = "Белый";
        } else {
            this.color = color;
        }

        // Если не указан год
        if (productionYear == null) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

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
