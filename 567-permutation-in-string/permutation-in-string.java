class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int fixedSize = s1.length();
		int freq[] = new int[26];
		for (int i : s1.toCharArray()) {
			freq[i - 'a']++;
		}
		HashMap<Character, Integer> hm = new HashMap<>();
		int l = 0, r = 0;
		int ans = 0;
		while (r < s2.length()) {
			char ch = s2.charAt(r);
			hm.merge(ch, 1, Integer::sum);
			if (r - l + 1 == fixedSize) {
				// boolean flag=false;
				int c=0;
				for (int j = 0; j < 26; j++) {
					char x = (char) (j + 'a');
					// System.out.println(freq[j]!=0 );
					// System.out.println( hm.containsKey(x) +" "+ hm.get(x) +" "+freq[x-'a']);
					if (freq[j] != 0 && hm.containsKey(x) && hm.get(x) == freq[x - 'a']) {
				 c+=freq[j];
					}
					if(c==s1.length())
						return true;
				}

				r++;

			} else if (r - l + 1 < fixedSize) {
				r++;
			} else {
				while (r - l + 1 > fixedSize) {
					// System.out.println(s2.charAt(l));
					hm.put(s2.charAt(l), hm.get(s2.charAt(l)) - 1);
					// System.out.println(hm.get(s2.charAt(l)));
					if (hm.get(s2.charAt(l)) == 0) {
						hm.remove(s2.charAt(l));
					}
					l++;
				}
				if (r - l + 1 == fixedSize) {
					// boolean flag=false;
					int c=0;
					for (int j = 0; j < 26; j++) {
						char x = (char) (j + 'a');
						// System.out.println(freq[j]!=0 );
						// System.out.println( hm.containsKey(x) +" "+ hm.get(x) +" "+freq[x-'a']);
						if (freq[j] != 0 && hm.containsKey(x) && hm.get(x) == freq[x - 'a']) {
							 c+=freq[j]; 
						}
					}
					if(c==s1.length())
						return true;
					r++;
				
				}

			}

		}
		return false;
    }
}