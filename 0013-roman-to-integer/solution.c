#include <stdio.h>

// Function to get integer value of a single Roman numeral character
int value(char c) {
    switch(c) {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0;
    }
}

// Function to convert Roman numeral string to integer
int romanToInt(char *s) {
    int total = 0;
    int i = 0;
    while (s[i]) {
        int curr = value(s[i]);
        int next = value(s[i+1]);

        if (next > curr) {
            // Subtractive notation case
            total += (next - curr);
            i += 2;
        } else {
            total += curr;
            i += 1;
        }
    }
    return total;
}


