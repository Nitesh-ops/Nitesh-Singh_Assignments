/* Symbols: Write a class that defines next() method to return next number from Fibonacci series.
The class will have a private attributes ‘previousNo’ & ‘currentNo’. */
var FiboNumber = /** @class */ (function () {
    function FiboNumber(currentNum) {
        this.previousNo = Symbol();
        this.currentNo = Symbol();
        this.previousNo = currentNum;
    }
    FiboNumber.prototype.next = function () {
        return Math.round((this.previousNo * (1 + Math.sqrt(5))) / 2.0);
    };
    return FiboNumber;
}());
var fiboNumber = new FiboNumber(5);
console.log(fiboNumber.next());
