import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ICatalog catalog = new ProductCatalog();
        ICart cart = new Cart();
        DashBoard dashBoard = new DashBoard(catalog, cart);
        List<String> input = loadInput("input.txt");
        List<String> catalogInput = loadInput("catalog.txt");

        for(String line: catalogInput){
            String[] split = line.split(" ");
            List<String> tokens = Arrays.asList(split);
            catalog.addToCatalog(tokens);
        }

        // catalog loaded successfully
        for(String pName: input){
            if(catalog.chooseProduct(pName) == null){
                throw new RuntimeException("wrong product chosen to add in cart");
            }
            cart.addToCart(catalog.chooseProduct(pName), 1);
        }

        System.out.println(cart.getTotal());
    }

    public static List<String> loadInput(String fileName){
        List<String> inputList = new ArrayList<>();
        String workingDir = System.getProperty("user.dir");
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                inputList.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //inputList.forEach((i) -> System.out.println(i));
        return inputList;
    }

    public static void loadCatalog(){

    }
}
