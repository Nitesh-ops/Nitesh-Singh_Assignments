// 3.	Enhanced object properties: Create an ‘Order’ object having data members ‘id’, ‘title’, ‘price’. Add the methods printOrder() & getPrice(). Now, copy the order object using Object.assign().
var Order = {
    id: 124,
    title: "Book",
    price: 150,
    printOrder: function () {
        return "\nID: ".concat(this.id, "\nTitle: ").concat(this.title, "\nPrice:").concat(this.price);
    },
    getPrice: function () {
        return "Price of Order is: ".concat(this.price);
    }
};
var Order_copy = Object.assign({}, Order);
console.log(Order_copy.printOrder());
console.log(Order_copy.getPrice());
