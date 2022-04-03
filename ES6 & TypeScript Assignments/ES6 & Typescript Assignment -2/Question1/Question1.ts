/* Symbols: Write a class that defines next() method to return next number from Fibonacci series. 
The class will have a private attributes ‘previousNo’ & ‘currentNo’. */

class FiboNumber {
  previousNo = Symbol();
  currentNo = Symbol();
  constructor(currentNum) {
    this.previousNo = currentNum;
  }
  next() {
    return Math.round((this.previousNo * (1 + Math.sqrt(5))) / 2.0);
  }
}
let fiboNumber = new FiboNumber(5);
console.log(fiboNumber.next());
