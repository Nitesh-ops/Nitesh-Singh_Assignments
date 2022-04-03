function fibonacciNumbers() {
    var a = 0, b = 1, c = 1;
    document.write("Fibonacci Series:<br>");
    for (var i = 1; i <= 100; i++) {
        a = b;
        b = c;
        c = a + b;
        document.write(a + "<br>");
    }
}