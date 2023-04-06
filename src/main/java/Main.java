import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.File;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] products = {"Хлеб", "Квас", "Мясо"};
    static int[] prices = {10, 20, 30};

    static File saveFile = new File("basket.json");

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        XMLSettingsReader settings = new XMLSettingsReader(new File("shop.xml"));

//        Basket basket = null;
//        if (saveFile.exists()) {
//            basket = Basket.loadFromJSONFile(saveFile);
//        } else {
//            basket = new Basket(products, prices);
//        }
//
//        ClientLog log = new ClientLog();
//        while(true) {
//            System.out.println("Список возможных товаров для покупки");
//            for (int i = 0; i < products.length; i++) {
//                System.out.println(products[i]  + " " + prices[i] + "руб/шт");
//            }
//            System.out.println("Выбери товар и через пробел выбери его кол-во или введи 'end'");
//            String input = scanner.nextLine(); //юзер вводит данные
//            if ("end".equals(input)) {
//                log.exportAsCSV(new File("log.csv"));
//                break;
//            }
//            String[] parts = input.split(" ");
//            int productNumber = Integer.parseInt(parts[0]) - 1; //номер товара
//            int productCount = Integer.parseInt(parts[1]); //кол-во товара
//            basket.addToCart(productNumber, productCount);
//            log.log(productNumber, productCount);
//            basket.saveJSON(saveFile);
//        }
//
//        basket.printCart();
    }

}
