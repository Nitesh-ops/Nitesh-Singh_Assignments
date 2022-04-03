function convertCurrency() {
    var dollarAmount = document.getElementById("amount").value;
    document.write(dollarAmount * 74.28 + " INR<br>");
    document.write(dollarAmount * 109.14 + " Yen<br>");
    document.write(dollarAmount * 0.84 + " Euro<br>");
    document.write(Math.round(dollarAmount * 0.72 * 10) / 10 + " Pound sterling");

}