
# initial=(3,3,1)
# goal=(0,0,0)

# def ok(state):
# 	m,c,b=state 

# 	if(0<=m<=3 and 0<=c<=3):
# 		if( (m==0 or m>=c) and (3-m==0 or 3-m>=c) ):
# 			return True

# 	return False 

# def succ(state):
		



facts=[ ['a' , 'aa'] , ['a','bb'] , ['aa','aaa'] , ['c','z'] , ['z','ff'] ,['d','dd'] ]

def bc(data):
	res=[]
	for x in data:
		for A,B in facts:
			if(x==A and (A,B) not in res):
				res.append((A,B))
				data.append(B) 
	return res			

print(bc(['a','d']) )





