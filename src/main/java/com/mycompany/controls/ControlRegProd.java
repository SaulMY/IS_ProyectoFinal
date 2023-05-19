/* este programa se encargara de manejar una lista ligada de productos,
   asi mismo se encargara de agregar el manejo de archivos*/

package com.mycompany.controls;
import com.mycompany.entities.Product;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class ControlRegProd {
    
    LinkedList<Product> productsList = new LinkedList();
    Product product;
    String fileName = "products.txt";
    
    //se chequea que no haya productos duplicados
    
    //metodo para registrar un nuevo producto
    public void newProductP(String code, String name, String description, int price, int promoPrice, String[] benefits, String imgUrl, LocalDate discStar, LocalDate discEnd){
        //se usa el contructor para crear un nuevo producto a la lista de productos
        product = new Product(code, name, description, price, promoPrice, benefits, imgUrl, discStar, discEnd);
        productsList.add(product);
    }
    
    public void newProduct(String code, String name, String description, int price, String[] benefits, String imgUrl){
        //se usa el contructor para crear un nuevo producto a la lista de productos
        product = new Product(code, name, description, price, benefits, imgUrl);
        productsList.add(product);
    }
    
    //metodo para editar un producto en la lista mediante el indice
    public void editProductP (int index, String code, String name, String description, int price, int promoPrice, String[] benefits, String imgUrl, LocalDate discStar, LocalDate discEnd){
        product = new Product(code, name, description, price, promoPrice, benefits, imgUrl, discStar, discEnd);
        productsList.set(index, product);
    }
    public void editProduct (int index, String code, String name, String description, int price, String[] benefits, String imgUrl){
        product = new Product(code, name, description, price, benefits, imgUrl);
        productsList.set(index, product);
    }
    
    //metodo para guardarlo en un archivo txt
    public void saveOnFile() throws FileNotFoundException, IOException{
        try{
            FileOutputStream fileOut = new FileOutputStream("F:\\T.HECTOR S.M.Y\\ESTUDIO\\BUAP\\QUINTO SEMESTRE\\INGENIERIA DE SOFTWARE\\PROYECTO FINAL\\ProyectoIS\\obj.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(productsList);
            objectOut.close();
            System.out.println("Lista de productos guardada en elarchivo");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Error al guardar.");
        }
    }
    
    //Metodo para leer desde un archivo txt
    public void readFile(){
        try{
            FileInputStream fileIn = new FileInputStream("F:\\T.HECTOR S.M.Y\\ESTUDIO\\BUAP\\QUINTO SEMESTRE\\INGENIERIA DE SOFTWARE\\PROYECTO FINAL\\ProyectoIS\\obj.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            productsList = (LinkedList) objectIn.readObject();
            objectIn.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error al leer archivo.");
        }
    }
    
    //Metodo para buscar datos en la lista
    public int searchCode(String code){
        int index1 = 0;
        for (Product prod: productsList){
            if (prod.getCode().equals(code)){
                index1 = productsList.indexOf(prod);
                return  (index1);
            }
        }
        return(-1);
    }
    public int searchName(String name){
        int index2 = 0;
        for (Product prod: productsList){
            if (prod.getName().equals(name)){
                index2 = productsList.indexOf(prod);
                return (index2);
            }
        }
        return (-1);
    }
    
    //metodo para obtener los datos del objeto producto
    
    public String getNombre(int index){
        return (productsList.get(index).getName());
    }
    
    public String getCode(int index){
        return (productsList.get(index).getCode());
    }
    
    public String getDesc(int index){
        return (productsList.get(index).getDescription());
    }
    
    public String getPrice(int index){
        return (String.valueOf(productsList.get(index).getPrice()));
    }
    
    public String getPricePromo(int index){
        return (String.valueOf(productsList.get(index).getPromoPrice()));
    }
    
    public String getDate1(int index){
        LocalDate date = productsList.get(index).getDiscStar();
        return (date.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
    
    public String getDate2(int index){
        LocalDate date = productsList.get(index).getDiscFin();
        return (date.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
    
    public String getImg(int index){
        return (productsList.get(index).getImgUrl());
    }
    
    public String getBene(int index){
        String string = new String();
        String[] arr = productsList.get(index).getBenefits();
        
        for (int i = 0; i < productsList.get(index).getBenefits().length; i++){
            string = string + arr[i] + " ";
        }
        return (string);
    }
    
    public boolean isPromo (int index){
        return(productsList.get(index).isPromo());
    }
}
