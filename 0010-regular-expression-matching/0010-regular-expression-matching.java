class Solution {
    
    public boolean isMatch(String text, String pattern) {
		// all of the text and the pattern has been consumed at the same time, so they match
		if (text.isEmpty() && pattern.isEmpty()) {
			return true;
		}

		// the pattern has been consumed, yet there is text left to consume, so it's a mismatch
		if (!text.isEmpty() && pattern.isEmpty()) {
			return false;
		}

		// this block deals with the asterisk wildcard in the pattern
		if (pattern.length() > 1 && pattern.charAt(1) == '*') {
			// when matching against the asterisk wildcard, we need two characters, one an actual
			// character and then the asterisk. So, we consume two characters from the pattern at
			// this point
			String remainingPattern = pattern.substring(2);
			String remainingText = text;

			for (int i = 0; i < text.length() + 1; ++i) {
				// checking the same text against the remaining pattern allows a match even if there
				// are 0 occurrences of the character present at pattern[0]
				if (isMatch(remainingText, remainingPattern)) {
					return true;
				}

				if (remainingText.isEmpty()) {
					return false;
				}

				// if the current pattern character (pattern[0]) is not the dot wildcard
				// and if it is different from the current text character (remaining_text[0]),
				// report the mismatch
				if (pattern.charAt(0) != '.' && remainingText.charAt(0) != pattern.charAt(0)) {
					return false;
				}

				// current text character matched, moving on to check the next
				remainingText = remainingText.substring(1);
			}
		}

		if (text.isEmpty() || pattern.isEmpty()) {
			return false;
		}

		// # the same character appeared in the pattern and the text at the same time
		// or, the dot wildcard was encountered in the pattern, which allows us to
		// accept any character at this position in the text
		if (pattern.charAt(0) == '.' || pattern.charAt(0) == text.charAt(0)) {
			String remainingText = "";
			if (text.length() >= 2) {
				// consuming the matched character from the text
				remainingText = text.substring(1);
			}

			String remainingPattern = "";
			if (pattern.length() >= 2) {
				// consuming the matched character from the pattern
				remainingPattern = pattern.substring(1);
			}

			return isMatch(remainingText, remainingPattern);
		}

		return false;
	}
}