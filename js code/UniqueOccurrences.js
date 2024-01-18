function uniqueOccurrences(arr) {
	    let countMap = new Map();

	    // Count occurrences of each value in the array
	    for (let num of arr) {
	        countMap.set(num, (countMap.get(num) || 0) + 1);
	    }

	    // Check if the number of occurrences is unique
	    let occurrenceSet = new Set(countMap.values());
	    return countMap.size === occurrenceSet.size;
}

// Example usage
let arr = [1, 2, 2, 1, 1, 3];
console.log(uniqueOccurrences(arr));