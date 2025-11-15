public class Order {
//  Максимальное кол-во товаров в заказе
    int CAPACITY = 10;

    int productsCount = 0;

    String id;
    double price;
    Customer customer;
    String deliveryPoint;
    String orderDate;
    Product[] products = new Product[CAPACITY];
    String status; // Формируется | Оплачен | Закрыт

    Order(String id, Customer customer, String deliveryPoint, String orderDate) {
        this.id = id;
        this.customer = customer;
        this.deliveryPoint = deliveryPoint;
        this.orderDate = orderDate;
        this.status = "Формируется";
        this.price = 0;

    }

    void setStatus(String status) {
        this.status = status;
    }

    void payment() {
        for (int i = 0; i < productsCount; i++) {
            products[i].setStatus("Оплачен");
        }
        setStatus("Оплачен");
    }

    void changeProductsCount(Product product, int count) {
        for (int i = 0; i < productsCount; i++) {
            if(products[i].article.equals(product.article)) {
                if(count <= 0) {
                    products[i] = products[productsCount-1];
                    products[productsCount-1] = null;
                    productsCount--;
                    return;
                }
                products[i].quantity = count;
                return;
            }
        }
        product.quantity = count;
        products[productsCount] = product;
        productsCount+=1;
    }

    void getProduct(Product product, String gettingDate) {
        product.getProduct(gettingDate);
        boolean isAllGetting = true;
        for (int i = 0; i < productsCount; i++) {
            if(!products[i].status.equals("Получен")) {
                isAllGetting = false;
                break;
            }
        }
        if(isAllGetting) {
            setStatus("Закрыт");
        }
    }


    public String toString() {
        return "Заказ № " + id + "\n" + "Покупатель: " + customer.name;
    }
}
