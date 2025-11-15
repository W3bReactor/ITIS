/*
 Заказ:
 Номер
 Цена
 Получатель
 Пункт выдачи (Строка)
 Дата заказа
 Товары

 Получатель:
 Идентификатор
 Имя

 Товар:
 Артикул
 Название
 Продавец
 Срок доставки
 Дата получения
 Цена
 Количество

 Продавец:
 Наименование
 ИНН


    Журнал наблюдений
    Дисциплина
    Преподаватель
    Студент
    Оценка (кол-во баллов, дата)

 */

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("1", "Kamil");
        Seller seller1 = new Seller("1", "garifullin.insaf07@Mail.ru", "Insaf");
        Seller seller2 = new Seller("2", "rinat@Mail.ru", "Rinat");
        Product product1 = new Product("1", "Чашка капибара", seller1, 250.0);
        Product product2 = new Product("2", "Арбуз", seller2, 200);
        Product product3 = new Product("3", "Книга", seller1, 120);
        Product product4 = new Product("4", "Дыня", seller2, 150);

//        System.out.println(customer);
        Order order = new Order("1", customer, "г. Казань, пр. Победы 78", "08.11.2025");
        order.changeProductsCount(product1, 1);
        order.changeProductsCount(product2, 2);
        order.changeProductsCount(product3, 3);
        order.changeProductsCount(product4, 1);

        System.out.println(order);

        order.changeProductsCount(product1, 0);
        order.changeProductsCount(product2, 5);

        System.out.println(order);

        order.changeProductsCount(product4, 0);
        order.changeProductsCount(product4, 2);

        System.out.println(order);

        order.payment();

        System.out.println(order);

        order.getProduct(product1, "10.11.2025");
        System.out.println(order);
    }
}
