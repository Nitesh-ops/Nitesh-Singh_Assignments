function square(value) {
    return value * value;
}
function map(arr, testFunction) {
    var arr2 = [];
    for (var i = 0; i < arr.length; i++) {
        arr2.push(testFunction(arr[i]));
    }
    return arr2;
}

console.log(map([1, 2, 3, 4, 5], square));
console.log(map([1, 4, 9, 16, 25], Math.sqrt));