function concatArray() {
    var arr1 = document.getElementById("arr1").value;
    var array1 = arr1.split(",");
    var arr2 = document.getElementById("arr2").value;
    var array2 = arr2.split(",");

    var list = [];
    for (var i = 0; i < array1.length; ++i) {
        list.push(array1[i]);
        list.push(array2[i]);
    }

    document.write("Concatenation of the arrays using alternative technique: " + list);
}