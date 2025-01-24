package OOPS.animal;

public class Motor {
    public String modelName;
    public int modelNo;
    public int ModelPrice;

    public Motor(String modelName , int modelNo , int ModelPrice){
        this.modelName = modelName;
        this.modelNo = modelNo;
        this.ModelPrice = ModelPrice;
    }

    public void display(){
        System.out.println("Model Name "+modelName);
        System.out.println("Model Number"+modelNo);
        System.out.println("Model Price"+ModelPrice);
        
    }
    
}
class Car extends Motor{
    
    public double discountRate ;

    public Car (String modelName , int modelNo , int ModelPrice , double discountRate ){
        super(modelName , modelNo , ModelPrice);
        this.discountRate = discountRate;
    }
    public double discount(){
        return ModelPrice * discountRate / 100;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Discount rate "+ discountRate + " %");
        System.out.println("Discount is " + discount());
    }
}
