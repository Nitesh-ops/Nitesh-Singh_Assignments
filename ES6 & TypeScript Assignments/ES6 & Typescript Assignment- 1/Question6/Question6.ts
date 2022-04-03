/*Template literals: Draft a ticket to Sysnet that describes problem with your laptop. Use ‘template literals’ to add 
value of laptop model, your desk no, your name etc.*/

let brand = "Lenovo";
let series = "ideapad";
let model = "320 I50KB";
let owner_Name = "Nitesh";

const specs = {
  brand,
  series,
  model,
  owner_Name,
};
console.log(specs.brand);
console.log(specs.series);
console.log(specs.model);
console.log(specs.owner_Name);
