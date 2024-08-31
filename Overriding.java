public class Overriding {
    public static void main(String[] args) {
         oldTv otv=new oldTv();
         otv.changeChannel();
         otv.changeVolume();
         otv .powerOnOff();
        smartTv stv= new smartTv();
        stv.changeChannel();
        stv.changeVolume();
        stv.powerOnOff();
        stv.browse();

        oldTv ot=new smartTv();//here is smartTv object is created 
        //hence it will invoke the smartTv function
        ot.changeChannel();
        //ot.browse(); //it is not accessible as it assume smart tv as old tv which hasn't browse() function
        ot.changeVolume();
        ot.powerOnOff();
         
        /*smartTv sm=new oldTv();
        sm.changeChannel();*/
         //throw an errow as Type mismatch: cannot convert from oldTv to smartTv


    }
}

class oldTv{
    public void changeChannel(){
        System.out.println("oldTV channel is changed");
    }
    public void changeVolume(){
        System.out.println("oldTv volume is changed");
    }
    public void powerOnOff(){
        System.out.println("oldTv power is switched On or Off");
    }
}

class smartTv extends oldTv{
    @Override
     public void changeChannel(){
        System.out.println("smartTv channel is changed");
    }
    @Override
    public void changeVolume(){
        System.out.println("smartTv volume is changed");
    }
    @Override
    public void powerOnOff(){
        System.out.println("smartTv power is switched On or Off");
    }
    public void browse(){
        System.out.println("Browse different functions in smartTv");
    }
}
