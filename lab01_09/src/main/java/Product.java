public class Product {
    private String article;
    private Seller seller;
    private String name;
    private String deliveryDate; // Срок доставки
    private String gettingDate;
    private double price;
    private int quantity;
    private String status; // Формируется | Оплачен | Доставлен | Получен

    Product(String article, String name, Seller seller, double price) {
        this.article = article;
        this.name = name;
        this.seller = seller;
        this.price = price;
        this.deliveryDate = "";
        this.status = "Формируется";
        this.quantity = 0;
    }


    void setStatus(String status) {
//      "." - Оператор доступа
        this.status = status;
    }

    void getProduct(String gettingDate) {
        this.gettingDate = gettingDate;
        setStatus("Получен");
    }
}
