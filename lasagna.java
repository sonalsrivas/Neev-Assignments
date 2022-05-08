public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    int tot_=40;
    int layers_time;
    //Lasagna(){
        //this.tot_=tot_; 
    //}
    public int expectedMinutesInOven(){
        return tot_;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int passed){
        return (tot_-passed);
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers*2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int oven){
        return this.preparationTimeInMinutes(layers)+oven;
    }
}
