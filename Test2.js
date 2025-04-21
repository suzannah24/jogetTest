// Create an array of 10 random integers between 1-1000
const numbers = [];
for (let i = 0; i < 10; i++) {
  const randomNumber = Math.floor(Math.random() * 1000) + 1;
  numbers.push(randomNumber);
}

console.log("The random numbers are:");
numbers.forEach(number => {
  console.log(number);
});

const sum = numbers.reduce((total, current) => total + current, 0);
console.log("\nThe sum of all numbers is:", sum);