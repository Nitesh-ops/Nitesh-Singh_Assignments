function concatArray() {
    var arr1 = document.getElementById("arr1").value;
    var array1 = arr1.split(",");
    var arr2 = document.getElementById("arr2").value;
    var array2 = arr2.split(",");

    var concatedArray = array1.concat(array2);
    document.write("Concatenation of the arrays are: " + concatedArray);
}