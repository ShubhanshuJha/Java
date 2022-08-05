n = int(input())
m = int(input())
l = []
for i in range(n):
	s = input()
	l.append(s)
	
def fun(n, m, s):
	c = 0
	for i in s:
		r = i[::-1]
		if r in s:
			c = c + m
	return c
print(fun(n, m, l))
