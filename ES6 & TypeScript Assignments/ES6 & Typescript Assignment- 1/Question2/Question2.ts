// 2.	Scoping: Declare a variable inside if condition & make sure that it is not accessible outside if condition.
var num = 50;
if (num % 2 == 0) {
    let addNum = num + 2;
    console.log(addNum);
    
} else {
    let subtractNum = num - 1;
}

//Cannot find name 'subtractNum' because it is not avalaible outside else condition
//console.log(subtractNum);
