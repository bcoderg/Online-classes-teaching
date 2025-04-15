    n = len(s)
    longest = ""
    
    for i in range(n):
        seen = set()
        current_substr = ""
        
        for j in range(i, n):
            if s[j] in seen:
                break
            seen.add(s[j])
            current_substr += s[j]
        
        if len(current_substr) > len(longest):
            longest = current_substr
    
    return len(longest)
    
    

O(n^2)




//optimal approach    











