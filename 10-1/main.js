//問1
let numbers = [2, 5, 12, 13, 15, 18, 22];
for (i=0; i<numbers.length;i++){
    if(numbers[i]%2===0){
        let num = numbers[i];
        function isEven() {
        console.log(num + 'は偶数です');
        }
        isEven();
    }
}
    
//問2
class Car{
    constructor(gass,num){
        this.gass = gass;
        this.num = num;
    }

    getNumGas(){
        console.log(`ガソリンは${this.gass}です。ナンバーは${this.num}です`)
    }
}

let car1 = new Car(20.5,1234);
car1.getNumGas();