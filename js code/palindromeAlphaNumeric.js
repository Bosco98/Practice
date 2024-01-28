function isPalindrome(s) {
    if (s.length === 0) {
        return true;
    }

    let start = 0;
    let last = s.length - 1;

    while (start <= last) {
        const currFirst = s.charAt(start);
        const currLast = s.charAt(last);

        if (!isLetterOrDigit(currFirst)) {
            start++;
        } else if (!isLetterOrDigit(currLast)) {
            last--;
        } else {
            if (currFirst.toLowerCase() !== currLast.toLowerCase()) {
                return false;
            }
            start++;
            last--;
        }
    }

    return true;
}

function isLetterOrDigit(char) {
    return /^[0-9a-zA-Z]$/.test(char);
}

// Test cases
const s1 = "A man, a plan, a canal: Panama";
console.log(isPalindrome(s1)); // Output: true

const s2 = "race a car";
console.log(isPalindrome(s2)); // Output: false
