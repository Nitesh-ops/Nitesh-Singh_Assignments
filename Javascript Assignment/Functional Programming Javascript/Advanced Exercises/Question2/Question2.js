/* Make a “pure” recursive version of map. Hint: remember the slice and concat methods of arrays.
map([1, 2, 3, 4, 5], square); --> [1, 4, 9, 16, 25]
map([1, 4, 9, 16, 25], Math.sqrt); --> [1, 2, 3, 4, 5] */

function square(value) {
    return value * value;
}
function map(arr, testFunction) {
    var arr2 = [];
    if (arr.length === 0) {
        return arr2;
    }
    arr2.push(testFunction(arr[0]));
    return arr2.concat(map(arr.slice(1), testFunction));
}

console.log(map([1, 2, 3, 4, 5], square));
console.log(map([1, 4, 9, 16, 25], Math.sqrt));
