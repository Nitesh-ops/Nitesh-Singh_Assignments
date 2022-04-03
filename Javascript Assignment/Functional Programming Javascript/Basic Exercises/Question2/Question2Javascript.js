function square(x) {
    return x * x;
}

function double(x) {
    return x * 2;
}

function composed(func1, func2) {
    return function (value) {
        return func1(func2(value));
    
    };
}


var func1 = composed(square, double);
console.log("For composed(square, double) :" + func1(5));
console.log("For composed(square, double) :" + func1(10));

var func2 = composed(double, square);
console.log("For composed(double,square) :" + func2(5));
console.log("For composed(double,square) :" + func2(10));

