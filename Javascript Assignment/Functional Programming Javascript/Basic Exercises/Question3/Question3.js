function isEven(num) {
    if (num % 2 == 0) {
        return true;
    }
    return false;
}

function find(arr, testFunction) {
    for (var i = 0; i < arr.length; i++) {
        if (testFunction(arr[i])) {
            return arr[i];
        }
    }
}
console.log(find([1, 6, 5, 4, 2], isEven));