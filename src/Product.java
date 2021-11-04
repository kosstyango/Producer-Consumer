import java.util.Objects;

public class Product {
    String type; // тип игрушки
    char size; // размер игрушки
    int price; // цена игрушки

    public Product(String type, char size, int price) { // конструктор игрушки
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public char getSize() { return size; }
    public void setSize(char size) { this.size = size; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    @Override //переопределем метод сравнения объектов
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return size == product.size && price == product.price && type.equals(product.type);
    }

    @Override //определяем что входит в hash каждого объекта
    public int hashCode() {
        return Objects.hash(type, size, price);
    }

    @Override   //переопределяем toString
        public String toString() {
            return "Product [type= " + type + '\'' + ", size=" + size + ", price=" + price + "] ";

    }
}
