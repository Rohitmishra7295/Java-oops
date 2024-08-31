public class AbstractionMethod {

    public static void main(String[] args) {
        HospialAuthorities h= new MyHospital();
        h.emergency();
        h.appointment();
        h.admit();
        h.billing();
        h.ambluanceService();
        h.bloodBank();
       
       
       /*Type mismatch: cannot convert from HospialAuthorities to MyHospital
        Cannot instantiate the type HospialAuthorities*/
        // MyHospital h1=new HospialAuthorities();
       // h.appointment();
       /*HospialAuthorities h1=new HospialAuthorities();
       h1.admit();  // Cannot instantiate the type HospialAuthorities */

    //    HospialAuthorities h1=new HospialAuthorities(); //Object cannot be created of abstract class
    //    h1.admit();  //Cannot instantiate the type HospialAuthorities because HospitalAuthorities is a abstract class 
    }
}

abstract class HospialAuthorities{ 
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
    abstract void billing();
    abstract void ambluanceService();
    abstract void bloodBank();

    HospialAuthorities(){
        System.out.println("it provides the licence for opening new hospitals");
    }
}

class MyHospital extends HospialAuthorities{

    void emergency(){
        System.out.println("My hospital has emergency wards for patients");
    }
    void appointment(){
        System.out.println("My hospital has online as well as offline appointment services");
    }
    void admit(){
        System.out.println("My hospital has admit services");
    }
    void billing(){
        System.out.println("My hospital has easy billing services");
    }
    void ambluanceService(){
        System.out.println("My hospital has door step ambulance Services");
    }
    void bloodBank(){
        System.out.println("My hospital also provide cheap and best blood bank services");
    }

}
