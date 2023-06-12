
    public class Printer<T> {//type of thing that it will hold
        T thingToPrint;
        public Printer(T thingToPrint){//PASSING PARAMETERS
            this.thingToPrint=thingToPrint;
        }
        public void print(){
            System.out.println(thingToPrint);
        }
    }


