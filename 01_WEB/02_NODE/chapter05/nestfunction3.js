console.log(x); // undefined
console.log(y); // ReferenceError: Cannot access 'y' before initialization
function outer() {
  var outerVar = 5678;

  function inner() {
    var innerVar = 1234;
    console.log(outerVar);
  }
  inner();
  console.log(innerVar); // 에러
}

outer();
var x = 1000;
let y = 2000;
