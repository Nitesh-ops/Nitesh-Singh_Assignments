/* Make a “pure” recursive version of find. That is, don’t use any explicit loops (e.g. for loops or the
    forEach method), and don’t use any local variables (e.g., var x = ...) inside the functions. Hint:
    remember the slice method of arrays.
    function isEven(num) { return(num%2 == 0); }
    isEven(3) --> false
    isEven(4) --> true
    find([1, 3, 5, 4, 2], isEven); --> 4 */

function isEven(num) {
    if (num % 2 == 0) {
        return true;
    }
    return false;
}

function find(arr, testFunction) {

    if (arr.length === 0) {
        return "No even numbers found";
    }
    if (testFunction(arr[0])) {
        return arr[0];
    }
    //remove the 0 index and keep all the array and pass it again
    return find(arr.slice(1), testFunction);
}
console.log(find([3, 1, 5, 7, 2], isEven));
