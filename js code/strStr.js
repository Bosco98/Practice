function strStr(haystack, needle) {
    if (needle.length === 0) {
        return 0; // Empty needle is always found at index 0
    }

    for (let i = 0; i <= haystack.length - needle.length; i++) {
        if (haystack.substring(i, i + needle.length) === needle) {
            return i; // Found the first occurrence, return the index
        }
    }

    return -1; // Needle not found in haystack
}

// Example usage:
console.log(strStr("sadbutsad", "sad")); // Output: 0
console.log(strStr("leetcode", "leeto")); // Output: -1