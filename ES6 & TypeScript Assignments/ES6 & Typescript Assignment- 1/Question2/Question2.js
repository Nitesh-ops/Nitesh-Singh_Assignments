// 2.	Scoping: Declare a variable inside if condition & make sure that it is not accessible outside if condition.
var num = 50;
if (num % 2 == 0) {
    var addNum = num + 2;
    console.log(addNum);
}
else {
    var subtractNum = num - 1;
}
console.log(subtractNum);
