// 3.	Enhanced object properties: Create an ‘Order’ object having data members ‘id’, ‘title’, ‘price’. Add the methods printOrder() & getPrice(). Now, copy the order object using Object.assign().

const Order = {
  id: 124,
  title: "Book",
  price: 150,
  printOrder: function (): string {
    return `\nID: ${this.id}\nTitle: ${this.title}\nPrice:${this.price}`;
  },
  getPrice: function (): string {
    return `Price of Order is: ${this.price}`;
  },
};

const Order_copy = (<any>Object).assign({}, Order);
console.log(Order_copy.printOrder());
console.log(Order_copy.getPrice());
