function reverseArray() {
    var arr = [];
    for (var i = 0, maximum = 80; i < 6; i++) {
        arr.push(Math.round(Math.random() * maximum))
    }
    document.write("Original Array: " + arr);
    var reverseArr = arr.reverse();
    document.write("<br>After Reversing: " + reverseArr);

}