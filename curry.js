function sum(a, b, c) {
    return a + b + c;
}

const curry = function (func) {
    function curried(...args) {
        const arity = func.length;
        if (args.length >= arity) {
            return func(...args);
        } else {
            return (...moreArgs) => curried(...args, ...moreArgs);
        }
    }
    return curried;
};

// Create curried function
const csum = curry(sum);

// Test different call patterns
console.log(csum(1)(2)(3));    // Output: 6
console.log(csum(1, 2)(3));    // Output: 6
console.log(csum(1)(2, 3));    // Output: 6
console.log(csum(1, 2, 3));    // Output: 6
console.log(csum()(1, 2, 3));  // Output: 6