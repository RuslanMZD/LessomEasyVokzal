package lesson16;

;
import java.util.HashMap;
import java.util.Map;

public class Sklad {
    private HashMap<Tovar, Integer> tovars = new HashMap<>();

    public void addTovar(Tovar tovar,int value){
        if(tovars.containsKey(tovar)){
            int currentValue = tovars.get(tovar);
            tovars.put(tovar,currentValue+value);
        }else {
            tovars.put(tovar, value);
        }

    }

    public void deleteTovar(Tovar tovar,int value){
        if(!tovars.containsKey(tovar)){
            System.out.println("Такого товара нет");
            return;
        }

        if(value> tovars.get(tovar)){
            System.out.println("Товара на складе не достаточно");
            tovars.remove(tovar);
            return;
        }

        tovars.put(tovar,tovars.get(tovar)-value);

    }


    public void printAllTovar(){
        for(Map.Entry<Tovar,Integer> pair: tovars.entrySet()){
            System.out.println(pair.getKey().getName()+" - "+pair.getValue());
        }

//    for(Tovar t : tovars.keySet()){
//        System.out.println(t.getName()+" "+tovars.get(t));
//    }




    }

    public Tovar getMinCountTovar() {
        Tovar result = null;
        for(Tovar t : tovars.keySet()){
            if(result==null){
                result=t;
            }else{

                if(tovars.get(result)>tovars.get(t)){
                    result=t;
                }

            }


        }

        return result;
    }

    public Tovar getRichTovar(){
        Tovar result = null;
        for(Map.Entry<Tovar,Integer> pair : tovars.entrySet()){
            if(result==null){
                result=pair.getKey();
            }
            if(pair.getKey().getPrice()> result.getPrice()){
                result= pair.getKey();
            }


        }

        return result;
    }


    public double allSummTovarOnSkladFormatDouble(){
        double result = 0;

        for(Map.Entry<Tovar, Integer> pair : tovars.entrySet()){

            result+= (double) pair.getValue() * pair.getKey().getPrice();
        }



        return result;
    }


    public int allSummTovarOnSkladFormatInt(){
        int result = 0;

        for(Map.Entry<Tovar, Integer> pair : tovars.entrySet()){

            result+= pair.getValue() * pair.getKey().getPrice();
        }



        return result;
    }


    

}
