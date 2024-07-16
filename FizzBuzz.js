const number = Math.floor(Math.random() * 100) + 1;

for(let i=1; i<=number ; i++){
    let string = "";
    if(i%3 == 0 && i%5 == 0){
        string += "FizzBuzz";}
    else if(i%3 == 0){
        string += "Fizz";}
    else if(i%5 == 0){
        string += "Buzz";}
    else{
        string += i ;}
    console.log(string);
}